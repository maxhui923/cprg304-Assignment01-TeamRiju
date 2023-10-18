/**
 * Created on Oct 14, 2023
 *
 * Project: cprg304-Assignment01-TeamRiju
 */

 package utilities;
/**
 * MergeSort.java
 *
 * @author TeamRiju
 * @version 1.0
 *
 * Class Description: This class sorts the shape list using Merge sort
 */

import java.util.Comparator;

public class MergeSort <T extends Comparable<T>>{

    public void mergeSort(T[] list) {
        mergeSort(list, 0, list.length - 1);
    }
    
    public void mergeSort(T[] list, Comparator<T> comparator) {
        mergeSort(list, 0, list.length - 1, comparator);
    }

    private void mergeSort(T[] list, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergeSort(list, low, middle);
            mergeSort(list, middle + 1, high);
            merge(list, low, middle, high);
        }
    }
    
    private void mergeSort(T[] list, int low, int high, Comparator<T> comparator) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergeSort(list, low, middle, comparator);
            mergeSort(list, middle + 1, high, comparator);
            merge(list, low, middle, high, comparator);
        }
    }
    

    private void merge(T[] list, int low, int middle, int high) {
        int leftSize = middle - low + 1;
        int rightSize = high - middle;
    
        // Create temporary arrays
        T[] leftArray = (T[]) new Comparable[leftSize];
        T[] rightArray = (T[]) new Comparable[rightSize];
    
        // Copy data to temporary arrays
        System.arraycopy(list, low, leftArray, 0, leftSize);
        System.arraycopy(list, middle + 1, rightArray, 0, rightSize);
    
        int i = 0, j = 0, k = low;
    
        // Merge the two subarrays in descending order
        while (i < leftSize && j < rightSize) {
            if (leftArray[i].compareTo(rightArray[j]) >= 0) {
                list[k] = leftArray[i];
                i++;
            } else {
                list[k] = rightArray[j];
                j++;
            }
            k++;
        }
    
        // Copy the remaining elements from both arrays (if any)
        while (i < leftSize) {
            list[k] = leftArray[i];
            i++;
            k++;
        }
    
        while (j < rightSize) {
            list[k] = rightArray[j];
            j++;
            k++;
        }
    }
    private void merge(T[] list, int low, int middle, int high, Comparator<T> comparator) {
        int leftSize = middle - low + 1;
        int rightSize = high - middle;
    
        // Create temporary arrays
        T[] leftArray = (T[]) new Comparable[leftSize];
        T[] rightArray = (T[]) new Comparable[rightSize];
    
        // Copy data to temporary arrays
        System.arraycopy(list, low, leftArray, 0, leftSize);
        System.arraycopy(list, middle + 1, rightArray, 0, rightSize);
    
        int i = 0, j = 0, k = low;
    
        // Merge the two subarrays in descending order
        while (i < leftSize && j < rightSize) {
            if (comparator.compare(leftArray[i], rightArray[j]) >= 0) {
                list[k] = leftArray[i];
                i++;
            } else {
                list[k] = rightArray[j];
                j++;
            }
            k++;
        }
    
        // Copy the remaining elements from both arrays (if any)
        while (i < leftSize) {
            list[k] = leftArray[i];
            i++;
            k++;
        }
    
        while (j < rightSize) {
            list[k] = rightArray[j];
            j++;
            k++;
        }
    }
    
}
