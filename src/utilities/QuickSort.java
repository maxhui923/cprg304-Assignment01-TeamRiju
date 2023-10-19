/**
 * Created on Oct 14, 2023
 *
 * Project: cprg304-Assignment01-TeamRiju
 */

package utilities;

import java.util.Comparator;

/**
 * QuickSort.java
 *
 * @author TeamRiju
 * @version 1.0
 *
 *          Class Description: This class provides an implementation of the
 *          quick sort algorithm for sorting an array of elements.
 */

public class QuickSort<T extends Comparable<T>> {
    /**
     * Sorts an array of elements using the quick sort algorithm.
     *
     * @param list The array of elements to be sorted.
     */
    public void quickSort(T[] list) {
        quickSort(list, 0, list.length - 1);
    }

    /**
     * Sorts an array of elements using the quick sort algorithm, considering a
     * custom comparator.
     *
     * @param list       The array of elements to be sorted.
     * @param comparator A comparator to determine the order of elements. If null,
     *                   natural ordering is used.
     */
    public void quickSort(T[] list, Comparator<T> comparator) {
        quickSort(list, 0, list.length - 1, comparator);
    }

    private void quickSort(T[] list, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(list, low, high);
            quickSort(list, low, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, high);
        }
    }

    private void quickSort(T[] list, int low, int high, Comparator<T> comparator) {
        if (low < high) {
            int pivotIndex = partition(list, low, high, comparator);
            quickSort(list, low, pivotIndex - 1, comparator);
            quickSort(list, pivotIndex + 1, high, comparator);
        }
    }

    private int partition(T[] list, int low, int high) {
        T pivot = list[high]; // Choose the pivot element (e.g., the last element)
        int i = low - 1; // Index of the smaller element

        for (int j = low; j < high; j++) {
            // If the current element is greater than or equal to the pivot for descending
            // order
            if (list[j].compareTo(pivot) >= 0) {
                i++;
                // Swap list[i] and list[j]
                T temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }

        // Swap list[i+1] and pivot
        T temp = list[i + 1];
        list[i + 1] = list[high];
        list[high] = temp;

        return i + 1; // Return the index of the pivot
    }

    private int partition(T[] list, int low, int high, Comparator<T> comparator) {
        T pivot = list[high]; // Choose the pivot element (e.g., the last element)
        int i = low - 1; // Index of the smaller element

        for (int j = low; j < high; j++) {
            // If the current element is greater than or equal to the pivot for descending
            // order
            if (comparator.compare(list[j], pivot) >= 0) {
                i++;
                // Swap list[i] and list[j]
                T temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }

        // Swap list[i+1] and pivot
        T temp = list[i + 1];
        list[i + 1] = list[high];
        list[high] = temp;

        return i + 1; // Return the index of the pivot
    }
}
