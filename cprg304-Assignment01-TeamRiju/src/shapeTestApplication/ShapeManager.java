/**
 * Created on Oct 14, 2023
 *
 * Project: cprg304-Assignment01-TeamRiju
 */

package shapeTestApplication;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.StringTokenizer;

import ShapeDomain.*;

/**
 * ShapeManager.java
 *
 * @author TeamRiju
 * @version 1.0
 *
 *          Class Description: This class manages the shape list, volume and
 *          base area
 */
public class ShapeManager {

    // Attributes
    private Shape[] shapeList;

    // Constructors
    /**
     * Initializes an empty ShapeManager object with default values for all
     * attributes.
     */
    public ShapeManager() {
        fillShapeList();
    }

    // Operational Methods
    /**
     * Method to print the entire shape list using
     * an iterator.
     */
    public static void printShapeList(Shape[] shapeList, String attribute) {
        for (Shape shape : shapeList) {
            switch (attribute.toLowerCase()) {
                case "height":
                    System.out.println("Height: " + shape.getHeight());
                    break;
                case "basearea":
                    System.out.println("Base Area: " + shape.calcBaseArea());
                    break;
                case "volume":
                    System.out.println("Volume: " + shape.calcVolume());            }
        }
    }
    

    // Getters and Setters
    public Shape[] getShapeList() {
        return shapeList;
    }

    private void fillShapeList() {
        String className = "";
        try {
            BufferedReader fin = new BufferedReader(new FileReader("cprg304-Assignment01-TeamRiju/res/test.txt"));
            String line = fin.readLine();

            StringTokenizer st = new StringTokenizer(line, " ");

            int numShapes = Integer.parseInt(st.nextToken());
            shapeList = new Shape[numShapes];
            int shapeIndex = 0;

            while (st.hasMoreTokens()) {
                String shapeToken = st.nextToken();

                if (shapeToken.equals("TriangularPrism")) {
                    className = "ShapeDomain.Prism$" + shapeToken;
                } else if (shapeToken.equals("SquarePrism")) {
                    className = "ShapeDomain.Prism$" + shapeToken;
                } else if (shapeToken.equals("PentagonalPrism")) {
                    className = "ShapeDomain.Prism$" + shapeToken;
                } else if (shapeToken.equals("OctagonalPrism")) {
                    className = "ShapeDomain.Prism$" + shapeToken;
                } else {
                    className = "ShapeDomain." + shapeToken; // For other shapes
                }

                Class cls = Class.forName(className);

                if (className.compareTo("ShapeDomain.Cone") == 0) {
                    Class paramTypes[] = new Class[2];
                    paramTypes[0] = Double.TYPE;
                    paramTypes[1] = Double.TYPE;

                    Constructor ct = cls.getConstructor(paramTypes);

                    Object argList[] = new Object[2];
                    argList[0] = new Double(Double.parseDouble(st.nextToken()));
                    argList[1] = new Double(Double.parseDouble(st.nextToken()));

                    Object o = ct.newInstance(argList);
                    shapeList[shapeIndex] = (Shape) o;
                    shapeIndex++;
                } else if (className.compareTo("ShapeDomain.Cylinder") == 0) {
                    Class paramTypes[] = new Class[2];
                    paramTypes[0] = Double.TYPE;
                    paramTypes[1] = Double.TYPE;

                    Constructor ct = cls.getConstructor(paramTypes);

                    Object argList[] = new Object[2];
                    argList[0] = new Double(Double.parseDouble(st.nextToken()));
                    argList[1] = new Double(Double.parseDouble(st.nextToken()));

                    Object o = ct.newInstance(argList);
                    shapeList[shapeIndex] = (Shape) o;
                    shapeIndex++;
                } else if (className.compareTo("ShapeDomain.Pyramid") == 0) {
                    Class paramTypes[] = new Class[2];
                    paramTypes[0] = Double.TYPE;
                    paramTypes[1] = Double.TYPE;

                    Constructor ct = cls.getConstructor(paramTypes);

                    Object argList[] = new Object[2];
                    argList[0] = new Double(Double.parseDouble(st.nextToken()));
                    argList[1] = new Double(Double.parseDouble(st.nextToken()));

                    Object o = ct.newInstance(argList);
                    shapeList[shapeIndex] = (Shape) o;
                    shapeIndex++;
                }

                else if (className.compareTo("ShapeDomain.Prism$TriangularPrism") == 0) {
                    Class paramTypes[] = new Class[2];
                    paramTypes[0] = Double.TYPE;
                    paramTypes[1] = Double.TYPE;

                    Constructor ct = cls.getConstructor(paramTypes);

                    Object argList[] = new Object[2];
                    argList[0] = new Double(Double.parseDouble(st.nextToken()));
                    argList[1] = new Double(Double.parseDouble(st.nextToken()));

                    Object o = ct.newInstance(argList);
                    shapeList[shapeIndex] = (Shape) o;
                    shapeIndex++;
                }

                else if (className.compareTo("ShapeDomain.Prism$SquarePrism") == 0) {
                    Class paramTypes[] = new Class[2];
                    paramTypes[0] = Double.TYPE;
                    paramTypes[1] = Double.TYPE;

                    Constructor ct = cls.getConstructor(paramTypes);

                    Object argList[] = new Object[2];
                    argList[0] = new Double(Double.parseDouble(st.nextToken()));
                    argList[1] = new Double(Double.parseDouble(st.nextToken()));

                    Object o = ct.newInstance(argList);
                    shapeList[shapeIndex] = (Shape) o;
                    shapeIndex++;
                }

                else if (className.compareTo("ShapeDomain.Prism$PentagonalPrism") == 0) {
                    Class paramTypes[] = new Class[2];
                    paramTypes[0] = Double.TYPE;
                    paramTypes[1] = Double.TYPE;

                    Constructor ct = cls.getConstructor(paramTypes);

                    Object argList[] = new Object[2];
                    argList[0] = new Double(Double.parseDouble(st.nextToken()));
                    argList[1] = new Double(Double.parseDouble(st.nextToken()));

                    Object o = ct.newInstance(argList);
                    shapeList[shapeIndex] = (Shape) o;
                    shapeIndex++;
                }

                else if (className.compareTo("ShapeDomain.Prism$OctagonalPrism") == 0) {
                    Class paramTypes[] = new Class[2];
                    paramTypes[0] = Double.TYPE;
                    paramTypes[1] = Double.TYPE;

                    Constructor ct = cls.getConstructor(paramTypes);

                    Object argList[] = new Object[2];
                    argList[0] = new Double(Double.parseDouble(st.nextToken()));
                    argList[1] = new Double(Double.parseDouble(st.nextToken()));

                    Object o = ct.newInstance(argList);
                    shapeList[shapeIndex] = (Shape) o;
                    shapeIndex++;
                }

            }

            fin.close();
        } catch (IOException | ClassNotFoundException | NoSuchMethodException | InstantiationException
                | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}