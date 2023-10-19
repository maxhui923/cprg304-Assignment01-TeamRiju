/**
 * Created on Oct 14, 2023
 *
 * Project: cprg304-Assignment01-TeamRiju
 */

package ShapeDomain;

/**
 * PentagonalPrism is a class that represents a pentagonal prism shape and its
 * associated attributes.
 */
public class PentagonalPrism extends Prism {
    /**
     * Initializes a PentagonalPrism object with the given height and edge length.
     * 
     * @param height The height of the pentagonal prism.
     * @param edge   The length of one edge of the pentagon base.
     */
    public PentagonalPrism(double height, double edge) {
        super(height, edge);
    }

    /**
     * Calculates and returns the base area of the pentagonal prism.
     * 
     * @return The calculated base area.
     */
    @Override
    public double calcBaseArea() {
        return 5 * Math.pow(getEdge(), 2) * Math.tan(Math.toRadians(54)) / 4;
    }

    /**
     * Calculates and returns the volume of the pentagonal prism.
     * 
     * @return The calculated volume.
     */
    @Override
    public double calcVolume() {
        return calcBaseArea() * getHeight();
    }

    /**
     * Returns a string representation of the pentagonal prism, including its class
     * name, height, edge length, base area, and volume.
     * 
     * @return A formatted string representation of the pentagonal prism.
     */
    @Override
    public String toString() {
        return String.format("%s\nHeight = %.2f\nEdge   = %.2f\nBase area = %.2f\nVolume = %.2f",
                this.getClass().getSimpleName(), getHeight(), getEdge(), calcBaseArea(), calcVolume());
    }
}
