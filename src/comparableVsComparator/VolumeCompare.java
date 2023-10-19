package comparableVsComparator;

/**
 * Created on Oct 14, 2023
 *
 * VolumeCompare is a Comparator class that compares shapes based on their volume.
 *
 * @author TeamRiju
 * @version 1.0
 */
import java.util.Comparator;
import ShapeDomain.Shape; // ShapeDomain is a package containing the Shape class

public class VolumeCompare implements Comparator<Shape> {

    /**
     * Compares two shapes based on their volume.
     *
     * @param shape1 The first shape to compare.
     * @param shape2 The second shape to compare.
     * @return 100 if shape1's volume is greater, -100 if shape2's volume is
     *         greater,
     *         or 0 if the volumes are equal.
     */
    @Override
    public int compare(Shape shape1, Shape shape2) {
        if (shape1.calcVolume() > shape2.calcVolume()) {
            return 100;
        } else if (shape1.calcVolume() < shape2.calcVolume()) {
            return -100;
        } else {
            return 0;
        }
    }
}
