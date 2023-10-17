package comparableVsComparator;

/**
 * Created on Oct 14, 2023
 *
 * @author TeamRiju
 * @version 1.0
 * 
 */

import java.util.Comparator;

import ShapeDomain.Shape;

public class BaseareaCompare implements Comparator<Shape>{
    @Override
    public int compare(Shape shape1, Shape shape2){
        if( shape1.calcBaseArea() > shape2.calcBaseArea() )
        {
            return 100;
        }
        else if( shape1.calcBaseArea() < shape2.calcBaseArea() )
        {
            return -100;
        }
        else // shape1.calcBaseArea() == shape2.calcBaseArea()
        {
            return 0;
        }
    }
}
