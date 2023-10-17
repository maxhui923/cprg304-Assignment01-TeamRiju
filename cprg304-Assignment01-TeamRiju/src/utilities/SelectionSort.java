/**
 * Created on Oct 14, 2023
 *
 * Project: cprg304-Assignment01-TeamRiju
 */

package utilities;
/**
 * SelectionSort.java
 *
 * @author TeamRiju
 * @version 1.0
 *
 * Class Description: This class sorts the shape list using Selection sort
 */
import java.util.Comparator;

public class SelectionSort<T extends Comparable<T>> {
    public void selectionSort(T[] list) {
        selectionSort(list, null);
    }

    public void selectionSort(T[] list, Comparator<T> comparator) {
        int n = list.length;
        T temp;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                int comparisonResult;
                if (comparator == null) {
                    comparisonResult = list[j].compareTo(list[minIndex]);
                } else {
                    comparisonResult = comparator.compare(list[j], list[minIndex]);
                }

                if (comparisonResult > 0) {
                    minIndex = j;
                }
            }
            // Swap elements for descending order
            temp = list[minIndex];
            list[minIndex] = list[i];
            list[i] = temp;
        }
    }
}
