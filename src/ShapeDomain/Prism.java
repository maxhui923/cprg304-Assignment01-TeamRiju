/**
 * Created on Oct 14, 2023
 *
 * Project: cprg304-Assignment01-TeamRiju
 */
package ShapeDomain;

/**
 * Prism.java
 *
 * @author TeamRiju
 * @version 1.0
 *
 *          Class Description: This class represents a Prism and their
 *          associated attributes.
 */
public abstract class Prism extends Shape {

    // Attributes
    private double edge;

    // Constructors
    /**
     * Initializes an empty Prism object with default values for all
     * attributes.
     */

    public Prism() {
    }

    /**
     * User defined constructor to initialize
     * all class level attributes.
     * 
     * @param type   shape's type
     * @param height shape's height
     * @param edge   Prism's edge
     */

    public Prism(double height, double edge) {
        super(height);
        this.edge = edge;
    }

    // Getters and Setters
    /**
     * Method to return the value of edge
     * 
     * @return the edge
     */
    public double getEdge() {
        return edge;
    }

    /**
     * Method to set the value of edge
     * 
     * @param edge the edge to set
     */
    public void setEdge(double edge) {
        this.edge = edge;
    }

    // Operational Methods
    /*
     * (non-Javadoc)
     * 
     * @see shapeDomain.Shape#calcBaseArea()
     */
    @Override
    public abstract double calcBaseArea();

    /*
     * (non-Javadoc)
     * 
     * @see shapeDomain.Shape#calcVolume()
     */
    @Override
    public abstract double calcVolume();

    // Subclasses for specific Prism types
    public static class SquarePrism extends Prism {
        public SquarePrism(double height, double edge) {
            super(height, edge);
        }

        @Override
        public double calcBaseArea() {
            return Math.pow(getEdge(), 2);
        }

        @Override
        public double calcVolume() {
            return Math.pow(getEdge(), 2) * getHeight();
        }
    }

    public static class TriangularPrism extends Prism {
        public TriangularPrism(double height, double edge) {
            super(height, edge);
        }

        @Override
        public double calcBaseArea() {
            return Math.pow(getEdge(), 2) * Math.sqrt(3) / 4;
        }

        @Override
        public double calcVolume() {
            return calcBaseArea() * getHeight();
        }
    }

    public static class PentagonalPrism extends Prism {
        public PentagonalPrism(double height, double edge) {
            super(height, edge);
        }

        @Override
        public double calcBaseArea() {
            return 5 * Math.pow(getEdge(), 2) * Math.tan(Math.toRadians(54)) / 4;
        }

        @Override
        public double calcVolume() {
            return calcBaseArea() * getHeight();
        }
    }

    public static class OctagonalPrism extends Prism {
        public OctagonalPrism(double height, double edge) {
            super(height, edge);
        }

        @Override
        public double calcBaseArea() {
            return 2 * (1 + Math.sqrt(2)) * Math.pow(getEdge(), 2);
        }

        @Override
        public double calcVolume() {
            return calcBaseArea() * getHeight();
        }
    }
}
