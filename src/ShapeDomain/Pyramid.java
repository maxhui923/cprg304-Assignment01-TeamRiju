/**
 * Created on Oct 14, 2023
 *
 * Project: cprg304-Assignment01-TeamRiju
 */
package ShapeDomain;

/**
 * Pyramid.java
 *
 * @author TeamRiju
 * @version 1.0
 *
 *          Class Description: This class represents a Pyramid and their
 *          associated attributes.
 */
public class Pyramid extends Shape {

    // Attributes
    private double edge;

    // Constructors
    /**
     * Initializes an empty Pyramid object with default values for all
     * attributes.
     */

    public Pyramid() {
    }

    /**
     * User defined constructor to initialize
     * all class level attributes.
     * 
     * @param type   shape's type
     * @param height shape's height
     * @param edge   Pyramid's edge
     */

    public Pyramid(double height, double edge) {
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
    public double calcBaseArea() {
        return Math.pow(edge, 2);
    }

    /*
     * (non-Javadoc)
     * 
     * @see shapeDomain.Shape#calcVolume()
     */
    @Override
    public double calcVolume() {
        return Math.pow(edge, 2) * getHeight();
    }

    @Override
    public String toString() {
        return String.format("%15s height = %15.2f edge   = %10.2f Base area = %30.2f Volume = %30.2f", this.getClass().getSimpleName(), getHeight(), edge, calcBaseArea(), calcVolume());
        
    }

}
