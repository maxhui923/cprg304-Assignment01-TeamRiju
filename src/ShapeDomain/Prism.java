/**
 * Created on Oct 14, 2023
 *
 * Project: cprg304-Assignment01-TeamRiju
 */
package ShapeDomain;

/**
 * Prism is a class that represents a prism shape and its associated attributes.
 */
public class Prism extends Shape {

    // Attributes
    private double edge;

    // Constructors
    /**
     * Initializes an empty Prism object with default values for all attributes.
     */
    public Prism() {
    }

    /**
     * User-defined constructor to initialize all class-level attributes.
     * 
     * @param height The height of the prism.
     * @param edge   The length of one edge of the prism.
     */
    public Prism(double height, double edge) {
        super(height);
        this.edge = edge;
    }

    // Getters and Setters
    /**
     * Method to return the value of the edge.
     * 
     * @return The edge length.
     */
    public double getEdge() {
        return edge;
    }

    /**
     * Method to set the value of the edge.
     * 
     * @param edge The edge length to set.
     */
    public void setEdge(double edge) {
        this.edge = edge;
    }

    // Operational Methods
    /**
     * Calculates and returns the base area of the prism. In this class, it returns
     * 0.
     * 
     * @return The calculated base area (0 in this class).
     */
    @Override
    public double calcBaseArea() {
        return 0;
    }

    /**
     * Calculates and returns the volume of the prism. In this class, it returns 0.
     * 
     * @return The calculated volume (0 in this class).
     */
    @Override
    public double calcVolume() {
        return 0;
    }

    /**
     * Returns a string representation of the prism, including its class name,
     * height, edge length, base area, and volume.
     * 
     * @return A formatted string representation of the prism.
     */
    @Override
    public String toString() {
        return String.format("%s\nHeight = %.2f\nEdge = %.2f\nBase area = %.2f\nVolume = %.2f",
                this.getClass().getSimpleName(), getHeight(), getEdge(), calcBaseArea(), calcVolume());
    }
}
