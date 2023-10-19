/**
 * Created on Oct 14, 2023
 *
 * Project: cprg304-Assignment01-TeamRiju
 */

package utilities;

import java.util.Comparator;

/**
 * HeapSort.java
 *
 * @author TeamRiju
 * @version 1.0
 *
 *          Class Description: This class provides an implementation of the heap
 *          sort algorithm for sorting an array of elements.
 */
public class HeapSort<T extends Comparable<T>> {

    /**
     * Sorts an array of elements using the heap sort algorithm in descending order.
     *
     * @param list The array of elements to be sorted.
     */
    public void heapSort(T[] list) {
        int n = list.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(list, n, i);

        // One by one extract an element from the heap
        for (int i = n - 1; i > 0; i--) {
            // Move the current root to the end
            T temp = list[0];
            list[0] = list[i];
            list[i] = temp;

            // Call max heapify on the reduced heap
            heapify(list, i, 0);
        }
    }

    /**
     * Sorts an array of elements using the heap sort algorithm in descending order,
     * considering a custom comparator.
     *
     * @param list       The array of elements to be sorted.
     * @param comparator A comparator to determine the order of elements. If null,
     *                   natural ordering is used.
     */
    public void heapSort(T[] list, Comparator<T> comparator) {
        int n = list.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(list, n, i, comparator);

        // One by one extract an element from the heap
        for (int i = n - 1; i > 0; i--) {
            // Move the current root to the end
            T temp = list[0];
            list[0] = list[i];
            list[i] = temp;

            // Call max heapify on the reduced heap
            heapify(list, i, 0, comparator);
        }
    }

    // To heapify a subtree rooted with node i which is an index in arr[]. n is size
    // of the heap
    private void heapify(T[] list, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left = 2*i + 1
        int right = 2 * i + 2; // right = 2*i + 2

        // If the left child is larger than the root
        if (left < n && list[left].compareTo(list[largest]) < 0)
            largest = left;

        // If the right child is larger than the largest so far
        if (right < n && list[right].compareTo(list[largest]) < 0)
            largest = right;

        // If the largest is not the root
        if (largest != i) {
            T swap = list[i];
            list[i] = list[largest];
            list[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(list, n, largest);
        }
    }

    // Overloaded heapify method for custom comparators
    private void heapify(T[] list, int n, int i, Comparator<T> comparator) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left = 2*i + 1
        int right = 2 * i + 2; // right = 2*i + 2

        // If the left child is larger than the root
        if (left < n && comparator.compare(list[left], list[largest]) < 0)
            largest = left;

        // If the right child is larger than the largest so far
        if (right < n && comparator.compare(list[right], list[largest]) < 0)
            largest = right;

        // If the largest is not the root
        if (largest != i) {
            T swap = list[i];
            list[i] = list[largest];
            list[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(list, n, largest, comparator);
        }
    }
}
