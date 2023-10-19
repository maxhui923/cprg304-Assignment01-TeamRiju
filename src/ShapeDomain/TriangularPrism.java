/**
 * Created on Oct 14, 2023
 *
 * Project: cprg304-Assignment01-TeamRiju
 */

package ShapeDomain;

/**
 * TriangularPrism is a specific type of Prism representing a triangular prism
 * and its associated attributes.
 */
public class TriangularPrism extends Prism {
    /**
     * Initializes a TriangularPrism object with the given height and edge.
     * 
     * @param height The height of the triangular prism.
     * @param edge   The edge length of the equilateral triangular base.
     */
    public TriangularPrism(double height, double edge) {
        super(height, edge);
    }

    /**
     * Calculates and returns the base area of the triangular prism.
     * 
     * @return The calculated base area of the triangular prism.
     */
    @Override
    public double calcBaseArea() {
        return Math.pow(getEdge(), 2) * Math.sqrt(3) / 4;
    }

    /**
     * Calculates and returns the volume of the triangular prism.
     * 
     * @return The calculated volume of the triangular prism.
     */
    @Override
    public double calcVolume() {
        return calcBaseArea() * getHeight();
    }

    /**
     * Returns a formatted string representation of the TriangularPrism object,
     * including its height, edge length, base area, and volume.
     * 
     * @return A formatted string representing the TriangularPrism.
     */
    @Override
    public String toString() {
        return String.format("%s\nHeight = %.2f\nEdge = %.2f\nBase area = %.2f\nVolume = %.2f",
                this.getClass().getSimpleName(), getHeight(), getEdge(), calcBaseArea(), calcVolume());
    }
}
