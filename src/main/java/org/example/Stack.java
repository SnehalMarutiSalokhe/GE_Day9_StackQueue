package org.example;

import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> stack;

    public Stack() {
        stack = new LinkedList<>();
    }

    public void push(T item) {
        stack.addFirst(item); // Adds the item to the top of the stack
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    @Override
    public String toString() {
        return stack.toString();
    }

    public T peek() {
        return stack.peekFirst();
    }

    public T pop() {
        return stack.pollFirst();
    }

}
