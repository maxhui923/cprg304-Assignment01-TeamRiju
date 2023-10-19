/**
 * Created on Oct 14, 2023
 *
 * Project: cprg304-Assignment01-TeamRiju
 */
package ShapeDomain;

/**
 * Shape is an abstract class that represents a shape and its associated
 * attributes.
 */
public abstract class Shape implements Comparable<Shape> {
    // Attributes
    private double height;

    // Constructors
    /**
     * Initializes an empty Shape object with default values for all attributes.
     */
    public Shape() {
    }

    /**
     * User-defined constructor to initialize all class-level attributes.
     * 
     * @param height The height of the shape.
     */
    public Shape(double height) {
        this.height = height;
    }

    // Getters and Setters
    /**
     * Method to return the value of height.
     * 
     * @return The height of the shape.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Method to set the value of height.
     * 
     * @param height The height of the shape to set.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    // Operational Methods
    /**
     * Calculates the base area of a shape. Subclasses must implement this method.
     * 
     * @return The calculated base area of the shape.
     */
    public abstract double calcBaseArea();

    /**
     * Calculates the volume of a shape. Subclasses must implement this method.
     * 
     * @return The calculated volume of the shape.
     */
    public abstract double calcVolume();

    /**
     * Compares this shape to another shape based on their heights. Returns a
     * positive value if this shape's height is greater than the other shape's
     * height, a negative value if it's smaller, and zero if they are equal. For
     * descending order, the comparison logic is reversed.
     * 
     * @param that The shape to compare to.
     * @return A value indicating the order of the shapes based on their heights.
     */
    @Override
    public int compareTo(Shape that) {
        if (this.height > that.height) {
            return 1; // Return -1 for descending order
        } else if (this.height < that.height) {
            return -1; // Return 1 for descending order
        } else {
            return 0;
        }
    }
}
