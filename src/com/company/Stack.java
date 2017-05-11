package com.company;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Bryan on 2017-04-28.
 */
public class Stack<T> implements Iterable<T> {

    private Node first;
    private int size = 0;

    private class Node<R> {
        private R item;
        private Node next;

        public Node(R item, Node next) {
            this.item = item;
            this.next = next;
        }

        public R getItem() {
            return item;
        }

        public Node getNext() {
            return next;
        }
    }

    public void push(T item) {
        Node firstNode = first;
        first = new Node<T>(item, firstNode);
        size++;
    }

    public T pop() {
        if (!isEmpty()) {
            Node toPop = first;
            first = first.next;
            size--;
            return (T) toPop.getItem();
        }
        return null;
    }

    public boolean isEmpty() {
        return size() != 0;
    }

    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (T item : this) {
            s.append(item);
            s.append(' ');
        }
        return s.toString();
    }

    public Iterator<T> iterator() {
        return new ListIterator<T>(first);
    }

    private class ListIterator<E> implements Iterator<E> {
        private Node<E> current;

        public ListIterator(Node<E> first) {
            current = first;
        }

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public E next() {
            if (!hasNext()) throw new NoSuchElementException();
            E item = current.item;
            current = current.next;
            return item;
        }
    }
}
