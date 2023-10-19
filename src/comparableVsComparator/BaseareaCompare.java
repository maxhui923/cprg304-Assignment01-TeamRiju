package comparableVsComparator;

/**
 * Created on Oct 14, 2023
 *
 * BaseareaCompare is a Comparator class that compares shapes based on their base area.
 *
 * @author TeamRiju
 * @version 1.0
 */
import java.util.Comparator;
import ShapeDomain.Shape; // ShapeDomain is a package containing the Shape class

public class BaseareaCompare implements Comparator<Shape> {

    /**
     * Compares two shapes based on their base area.
     *
     * @param shape1 The first shape to compare.
     * @param shape2 The second shape to compare.
     * @return 100 if shape1's base area is greater, -100 if shape2's base area is
     *         greater,
     *         or 0 if the base areas are equal.
     */
    @Override
    public int compare(Shape shape1, Shape shape2) {
        if (shape1.calcBaseArea() > shape2.calcBaseArea()) {
            return 100;
        } else if (shape1.calcBaseArea() < shape2.calcBaseArea()) {
            return -100;
        } else {
            return 0;
        }
    }
}
