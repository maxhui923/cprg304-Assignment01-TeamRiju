/**
 * Created on Oct 14, 2023
 *
 * Project: cprg304-Assignment01-TeamRiju
 */

package utilities;

import java.util.Comparator;

/**
 * InsertionSort.java
 *
 * @author TeamRiju
 * @version 1.0
 *
 *          Class Description: This class provides an implementation of the
 *          insertion sort algorithm for sorting an array of elements.
 */
public class InsertionSort<T extends Comparable<T>> {

    /**
     * Sorts an array of elements using the insertion sort algorithm in descending
     * order.
     *
     * @param list The array of elements to be sorted.
     */
    public void insertionSort(T[] list) {
        insertionSort(list, null);
    }

    /**
     * Sorts an array of elements using the insertion sort algorithm in descending
     * order, considering a custom comparator.
     *
     * @param list       The array of elements to be sorted.
     * @param comparator A comparator to determine the order of elements. If null,
     *                   natural ordering is used.
     */
    public void insertionSort(T[] list, Comparator<T> comparator) {
        int n = list.length;
        for (int i = 1; i < n; i++) {
            T key = list[i];
            int j = i - 1;

            while (j >= 0 && (comparator == null ? key.compareTo(list[j]) : comparator.compare(key, list[j])) > 0) {
                list[j + 1] = list[j];
                j--;
            }

            list[j + 1] = key;
        }
    }
}
