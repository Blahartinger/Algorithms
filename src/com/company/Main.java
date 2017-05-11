package com.company;

public class Main {

    public static void main(String[] args) {

        Integer[] input = {24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12};
        Quicksort<Integer> quickSort = new Quicksort();
        quickSort.sort(input);
        print(input);

        Integer[] input2 = {24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12};
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        bubbleSort.bubbleSort(input2);
        print(input2);

        BinarySearch<Integer> binarySearch = new BinarySearch();
        System.out.print(String.format("%d\n", binarySearch.searchRecursive(45, input2)));
        System.out.print(String.format("%d\n", binarySearch.searchLooped(45, input2)));
        System.out.print(String.format("%d\n", binarySearch.searchRecursive(99, input2)));
        System.out.print(String.format("%d\n", binarySearch.searchLooped(99, input2)));
        System.out.print(String.format("%d\n", binarySearch.searchRecursive(2, input2)));
        System.out.print(String.format("%d\n", binarySearch.searchLooped(2, input2)));

        System.out.print("Stack");
        Stack<String> stringStack = new Stack<>();
        stringStack.push("One");
        stringStack.push("Two");
        stringStack.push("Three");

    }

    private static void print(Integer[] integers) {
        for (int i : integers) {
            System.out.print(String.format("%d\n", i));
        }
    }
}

