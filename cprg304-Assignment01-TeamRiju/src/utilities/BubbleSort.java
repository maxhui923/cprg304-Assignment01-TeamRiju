/**
 * Created on Oct 14, 2023
 *
 * Project: cprg304-Assignment01-TeamRiju
 */

package utilities;

/**
 * BubbleSort.java
 *
 * @author TeamRiju
 * @version 1.0
 *
 * Class Description: This class sorts the shape list using bubble sort
 */
import java.util.Comparator;

public class BubbleSort<T extends Comparable<T>> {

    public void bubbleSort(T[] list) {
        bubbleSort(list, null);
    }

    public void bubbleSort(T[] list, Comparator<T> comparator) {
        int n = list.length;
        T temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                int comparisonResult;
                if (comparator == null) {
                    comparisonResult = list[j - 1].compareTo(list[j]);
                } else {
                    comparisonResult = comparator.compare(list[j - 1], list[j]);
                }

                if (comparisonResult < 0) {
                    // Swap elements for descending order
                    temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
}
