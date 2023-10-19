/**
 * Created on Oct 14, 2023
 *
 * Project: cprg304-Assignment01-TeamRiju
 */
package ShapeDomain;

/**
 * Pyramid is a class that represents a pyramid shape and its associated
 * attributes.
 */
public class Pyramid extends Shape {

    // Attributes
    private double edge;

    // Constructors
    /**
     * Initializes an empty Pyramid object with default values for all attributes.
     */
    public Pyramid() {
    }

    /**
     * User-defined constructor to initialize all class-level attributes.
     * 
     * @param height The height of the pyramid.
     * @param edge   The length of one edge of the pyramid.
     */
    public Pyramid(double height, double edge) {
        super(height);
        this.edge = edge;
    }

    // Getters and Setters
    /**
     * Method to return the value of edge.
     * 
     * @return The edge length.
     */
    public double getEdge() {
        return edge;
    }

    /**
     * Method to set the value of edge.
     * 
     * @param edge The edge length to set.
     */
    public void setEdge(double edge) {
        this.edge = edge;
    }

    // Operational Methods
    /**
     * Calculates and returns the base area of the pyramid.
     * 
     * @return The calculated base area.
     */
    @Override
    public double calcBaseArea() {
        return Math.pow(edge, 2);
    }

    /**
     * Calculates and returns the volume of the pyramid.
     * 
     * @return The calculated volume.
     */
    @Override
    public double calcVolume() {
        return Math.pow(edge, 2) * getHeight();
    }

    /**
     * Returns a string representation of the pyramid, including its class name,
     * height, edge length, base area, and volume.
     * 
     * @return A formatted string representation of the pyramid.
     */
    @Override
    public String toString() {
        return String.format("%s\nHeight = %.2f\nEdge = %.2f\nBase area = %.2f\nVolume = %.2f",
                this.getClass().getSimpleName(), getHeight(), edge, calcBaseArea(), calcVolume());
    }
}
