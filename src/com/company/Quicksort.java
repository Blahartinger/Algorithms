package com.company;

/**
 * Created by Bryan on 2017-04-27.
 */
public class Quicksort<T extends Comparable<T>> {

    private T[] inputArray;

    public T[] sort(T[] inputArray) {
        this.inputArray = inputArray;
        quicksort(0, inputArray.length - 1);
        return this.inputArray;
    }

    private void quicksort(int lowerIndex, int upperIndex) {
        T pivot = inputArray[lowerIndex + (upperIndex - lowerIndex) / 2]; // taking the middle element as a pivot point
        int i = lowerIndex;
        int j = upperIndex;

        while (i <= j) {
            while (inputArray[i].compareTo(pivot) < 0) {
                i++;
            }
            while (inputArray[j].compareTo(pivot) > 0) {
                j--;
            }

            if (i <= j) {
                switchValues(i, j);
                i++;
                j--;
            }
        }
        if (lowerIndex < j) {
            quicksort(lowerIndex, j);
        }

        if (i < upperIndex) {
            quicksort(i, upperIndex);
        }

    }

    private void switchValues(int index1, int index2) {
        T temp = inputArray[index1];
        inputArray[index1] = inputArray[index2];
        inputArray[index2] = temp;
    }
}
