/**
 * Created on Oct 14, 2023
 *
 * Project: cprg304-Assignment01-TeamRiju
 */

package utilities;

import java.util.Comparator;

/**
 * SelectionSort.java
 *
 * @author TeamRiju
 * @version 1.0
 *
 *          Class Description: This class provides an implementation of the
 *          selection sort algorithm for sorting an array of elements.
 */
public class SelectionSort<T extends Comparable<T>> {
    /**
     * Sorts an array of elements using the selection sort algorithm in descending
     * order.
     *
     * @param list The array of elements to be sorted.
     */
    public void selectionSort(T[] list) {
        selectionSort(list, null);
    }

    /**
     * Sorts an array of elements using the selection sort algorithm in descending
     * order, considering a custom comparator.
     *
     * @param list       The array of elements to be sorted.
     * @param comparator A comparator to determine the order of elements. If null,
     *                   natural ordering is used.
     */
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
