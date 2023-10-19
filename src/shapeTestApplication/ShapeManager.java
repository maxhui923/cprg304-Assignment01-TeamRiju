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
 *          Class Description: This class manages the shape list, volume, and
 *          base area.
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
        // Empty constructor
    }

    // Operational Methods

    /**
     * Method to print the entire shape list using an iterator.
     *
     * @param shapeList The array of shapes to be printed.
     * @param attribute The attribute to be printed ("height," "basearea," or
     *                  "volume").
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
                    System.out.println("Volume: " + shape.calcVolume());
            }
        }
    }

    // Getters and Setters
    public Shape[] getShapeList() {
        return shapeList;
    }

    /**
     * Fill the shape list by reading shape data from a file.
     *
     * @param filepath The path to the file containing shape data.
     */
    public void fillShapeList(String filepath) {
        String className = "";
        try {
            BufferedReader fin = new BufferedReader(new FileReader(filepath));
            String line = fin.readLine();

            StringTokenizer st = new StringTokenizer(line, " ");

            int numShapes = Integer.parseInt(st.nextToken());
            shapeList = new Shape[numShapes];
            int shapeIndex = 0;

            while (st.hasMoreTokens()) {
                String shapeToken = st.nextToken();

                className = "ShapeDomain." + shapeToken;

                Class<?> cls = Class.forName(className);

                Class<?> paramTypes[] = new Class[2];
                paramTypes[0] = double.class;
                paramTypes[1] = double.class;

                Constructor<?> ct = cls.getConstructor(paramTypes);

                Object argList[] = new Object[2];
                argList[0] = Double.parseDouble(st.nextToken());
                argList[1] = Double.parseDouble(st.nextToken());

                Object o = ct.newInstance(argList);
                shapeList[shapeIndex] = (Shape) o;
                shapeIndex++;

            }

            fin.close();
        } catch (IOException | ClassNotFoundException | NoSuchMethodException | InstantiationException
                | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
