/**
 * Created on Oct 14, 2023
 *
 * Project: cprg304-Assignment01-TeamRiju
 */

package ShapeDomain;

/**
 * SquarePrism is a specific type of Prism representing a square prism and its
 * associated attributes.
 */
public class SquarePrism extends Prism {
    /**
     * Initializes a SquarePrism object with the given height and edge.
     * 
     * @param height The height of the square prism.
     * @param edge   The edge length of the square base.
     */
    public SquarePrism(double height, double edge) {
        super(height, edge);
    }

    /**
     * Calculates and returns the base area of the square prism.
     * 
     * @return The calculated base area of the square prism.
     */
    @Override
    public double calcBaseArea() {
        return Math.pow(getEdge(), 2);
    }

    /**
     * Calculates and returns the volume of the square prism.
     * 
     * @return The calculated volume of the square prism.
     */
    @Override
    public double calcVolume() {
        return Math.pow(getEdge(), 2) * getHeight();
    }

    /**
     * Returns a formatted string representation of the SquarePrism object,
     * including its height, edge length, base area, and volume.
     * 
     * @return A formatted string representing the SquarePrism.
     */
    @Override
    public String toString() {
        return String.format("%s\nHeight = %.2f\nEdge = %.2f\nBase area = %.2f\nVolume = %.2f",
                this.getClass().getSimpleName(), getHeight(), getEdge(), calcBaseArea(), calcVolume());
    }
}
