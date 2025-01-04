package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

//            Stack<Integer> stack = new Stack<>();
//            stack.push(70);
//            stack.push(30);
//            stack.push(56);
//            System.out.println("Stack after pushes: " + stack);
//
//        System.out.println("UC2 " + stack);
//
//        while (!stack.isEmpty()) {
//            System.out.println("Top item: " + stack.peek());
//            System.out.println("Popped item: " + stack.pop());
//            System.out.println("Stack now: " + stack);
//        }


        Queue<Integer> queue = new Queue<>();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        System.out.println("Queue after enqueues: " + queue);

    }
}