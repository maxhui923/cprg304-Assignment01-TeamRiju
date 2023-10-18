/**
 * Created on Oct 14, 2023
 *
 * Project: cprg304-Assignment01-TeamRiju
 */
package ShapeDomain;


/**
 *	Shape.java
 *
 * @author TeamRiju
 * @version 1.0
 *
 * Class Description:  This class represents a Shape and their
 * associated attributes.
 */

public abstract class Shape implements Comparable<Shape>
{
    //Attributes
    private double height;

    //Constructors
    /**
     * Initializes an empty Shape object with default values for all
     * attributes.
     */

    public Shape(){

    }

    /**
     * User defined constructor to initialize
     * all class level attributes.
     * @param type shape's type
     * @param height shape's height
     */

    public Shape(double height){
        this.height = height;}

    //Getters and Setters
    /**
     * Method to return the value of height
     * @return the height
     */
    public double getHeight() {
        return height;}

    /**
     * Method to set the value of height
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;}
    
    //Operational Methods
    /**
     * Method to calculate the base area of a shape
     * @return the base area
     */
    public abstract double calcBaseArea();

    /**
     * Method to calculate the volume of a shape
     * @return the volume
     */
    public abstract double calcVolume();

   
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
