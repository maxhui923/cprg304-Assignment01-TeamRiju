/**
 * Created on Oct 14, 2023
 *
 * Project: cprg304-Assignment01-TeamRiju
 */
package ShapeDomain;

/**
 * OctagonalPrism is a class that represents an octagonal prism shape and its
 * associated attributes.
 */
public class OctagonalPrism extends Prism {
    /**
     * Initializes an OctagonalPrism object with the given height and edge length.
     * 
     * @param height The height of the octagonal prism.
     * @param edge   The length of one edge of the octagon base.
     */
    public OctagonalPrism(double height, double edge) {
        super(height, edge);
    }

    /**
     * Calculates and returns the base area of the octagonal prism.
     * 
     * @return The calculated base area.
     */
    @Override
    public double calcBaseArea() {
        return 2 * (1 + Math.sqrt(2)) * Math.pow(getEdge(), 2);
    }

    /**
     * Calculates and returns the volume of the octagonal prism.
     * 
     * @return The calculated volume.
     */
    @Override
    public double calcVolume() {
        return calcBaseArea() * getHeight();
    }

    /**
     * Returns a string representation of the octagonal prism, including its class
     * name, height, edge length, base area, and volume.
     * 
     * @return A formatted string representation of the octagonal prism.
     */
    @Override
    public String toString() {
        return String.format("%s\nHeight = %.2f\nEdge = %.2f\nBase area = %.2f\nVolume = %.2f",
                this.getClass().getSimpleName(), getHeight(), getEdge(), calcBaseArea(), calcVolume());
    }
}
