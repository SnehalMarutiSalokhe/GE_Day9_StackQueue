package org.example;

import java.util.LinkedList;

public class Queue<T> {
    private LinkedList<T> queue;

    public Queue() {
        queue = new LinkedList<>();
    }

    public void enqueue(T item) {
        queue.addLast(item);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    @Override
    public String toString() {
        return queue.toString();
    }

    public T dequeue() {
        return queue.pollFirst();
    }

}
