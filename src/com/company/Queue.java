package com.company;

/**
 * Created by Bryan on 2017-04-28.
 */
public class Queue<T> {
    Stack<T> inbox = new Stack<>();
    Stack<T> outbox = new Stack<>();

    public void enqueue(T item) {
        inbox.push(item);
    }

    public T dequeue() {
        if(outbox.isEmpty()){
            while (!inbox.isEmpty()){
                outbox.push(inbox.pop());
            }
        }
        return outbox.pop();
    }
}
