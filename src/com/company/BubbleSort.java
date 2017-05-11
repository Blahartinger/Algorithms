package com.company;

/**
 * Created by Bryan on 2017-04-27.
 */
public class BubbleSort<T extends Comparable<T>> {

    public void bubbleSort(T[] inputArray) {
        int n = inputArray.length;
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (inputArray[i].compareTo(inputArray[i - 1]) <= 0) {
                    swap(inputArray, i - 1, i);
                    swapped = true;
                }
            }
            n--;
        }
    }

    private void swap(T[] inputArray, int index1, int index2) {
        T temp = inputArray[index1];
        inputArray[index1] = inputArray[index2];
        inputArray[index2] = temp;
    }
}
