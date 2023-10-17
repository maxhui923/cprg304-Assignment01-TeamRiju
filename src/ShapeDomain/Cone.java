/**
 * Created on Oct 14, 2023
 *
 * Project: cprg304-Assignment01-TeamRiju
 */
package ShapeDomain;

/**
 * Cone.java
 *
 * @author TeamRiju
 * @version 1.0
 *
 *          Class Description: This class represents a Cone and their
 *          associated attributes.
 */
public class Cone extends Shape {

    // Attributes
    private double radius;

    // Constructors
    /**
     * Initializes an empty Cone object with default values for all
     * attributes.
     */

    public Cone() {
    }

    /**
     * User defined constructor to initialize
     * all class level attributes.
     * 
     * @param type   shape's type
     * @param height shape's height
     * @param radius cone's radius
     */

    public Cone(double height, double radius) {
        super(height);
        this.radius = radius;
    }

    // Getters and Setters
    /**
     * Method to return the value of radius
     * 
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Method to set the value of radius
     * 
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Operational Methods
    /*
     * (non-Javadoc)
     * 
     * @see shapeDomain.Shape#calcBaseArea()
     */
    @Override
    public double calcBaseArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    /*
     * (non-Javadoc)
     * 
     * @see shapeDomain.Shape#calcVolume()
     */
    @Override
    public double calcVolume() {
        return (Math.PI * Math.pow(radius, 2) * getHeight()) / 3;
    }

}