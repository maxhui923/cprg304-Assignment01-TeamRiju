/**
 * Created on Oct 14, 2023
 *
 * Project: cprg304-Assignment01-TeamRiju
 */

package utilities;

/**
 * InsertionSort.java
 *
 * @author TeamRiju
 * @version 1.0
 *
 * Class Description: This class sorts the shape list using insertion sort
 */

import java.util.Comparator;

public class InsertionSort<T extends Comparable<T>> {

    public void insertionSort(T[] list) {
        insertionSort(list, null);
    }

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
