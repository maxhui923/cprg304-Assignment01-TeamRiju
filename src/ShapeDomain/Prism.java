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
public class Prism extends Shape {

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
    public double calcBaseArea(){
        return 0;
    };

    /*
     * (non-Javadoc)
     * 
     * @see shapeDomain.Shape#calcVolume()
     */
    @Override
    public double calcVolume(){
        return 0;
    };
    
    @Override
    public String toString() {
        return String.format("%s\nHeight = %.2f\nEdge = %.2f\nBase area = %.2f\nVolume = %.2f",
                this.getClass().getSimpleName(), getHeight(), getEdge(), calcBaseArea(), calcVolume());

    }
    
}
