package com.company;

/**
 * Created by Bryan on 2017-04-27.
 */
public class Mergesort {

    private Comparable[] merge(Comparable[] a, Comparable[] b) {
        Comparable[] c = new Comparable[a.length + b.length];
        int i = 0, j = 0;
        for (int k = 0; k < c.length; k++) {
            if (i >= a.length) {
                c[k] = b[j++];
            } else if (j >= b.length) {
                c[k] = a[i++];
            } else if (a[i].compareTo(b[j]) <= 0) {
                c[k] = a[i++];
            } else {
                c[k] = b[j++];
            }
        }
        return c;
    }

    public Comparable[] mergesort(Comparable[] input) {
        int N = input.length;
        if (N <= 1) {
            return input;
        }
        Comparable[] a = new Comparable[N / 2];
        Comparable[] b = new Comparable[N - N / 2];
        for (int i = 0; i < a.length; i++) {
            a[i] = input[i];
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = input[i + N / 2];
        }
        return merge(mergesort(a), mergesort(b));
    }

}
