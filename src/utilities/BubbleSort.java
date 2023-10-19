/**
 * Created on Oct 14, 2023
 *
 * Project: cprg304-Assignment01-TeamRiju
 */

package utilities;

import java.util.Comparator;

/**
 * BubbleSort.java
 *
 * @author TeamRiju
 * @version 1.0
 *
 *          Class Description: This class provides an implementation of the
 *          bubble sort algorithm for sorting an array of elements.
 */
public class BubbleSort<T extends Comparable<T>> {

    /**
     * Sorts an array of elements using the bubble sort algorithm in descending
     * order.
     *
     * @param list The array of elements to be sorted.
     */
    public void bubbleSort(T[] list) {
        bubbleSort(list, null);
    }

    /**
     * Sorts an array of elements using the bubble sort algorithm in descending
     * order, considering a custom comparator.
     *
     * @param list       The array of elements to be sorted.
     * @param comparator A comparator to determine the order of elements. If null,
     *                   natural ordering is used.
     */
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
