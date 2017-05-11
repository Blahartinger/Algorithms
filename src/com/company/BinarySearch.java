package com.company;

/**
 * Created by Bryan on 2017-04-27.
 */
public class BinarySearch<T extends Comparable<T>> {

    // Returns found index, else -1 if not found
    public int searchLooped(T element, T[] inputArray) {
        int low = 0;
        int high = inputArray.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (inputArray[middle].compareTo(element) == 0) {
                return middle;
            }
            if (element.compareTo(inputArray[middle]) < 0) {
                high = middle - 1;
            }
            if (element.compareTo(inputArray[middle]) > 0) {
                low = middle + 1;
            }
        }
        return -1;
    }

    // Returns found index, else -1 if not found
    public int searchRecursive(T element, T[] inputArray) {
        return searchRecursiveInternal(element, 0, inputArray.length - 1, inputArray);
    }

    private int searchRecursiveInternal(T element, int lowerIndex, int higherIndex, T[] inputArray) {

        if (lowerIndex > higherIndex) {
            return -1;
        }

        int middle = lowerIndex + (higherIndex - lowerIndex) / 2;

        if (element.compareTo(inputArray[middle]) < 0) {
            return searchRecursiveInternal(element, lowerIndex, middle - 1, inputArray);
        } else if (element.compareTo(inputArray[middle]) > 0) {
            return searchRecursiveInternal(element, middle + 1, higherIndex, inputArray);
        } else {
            return middle;
        }
    }
}
