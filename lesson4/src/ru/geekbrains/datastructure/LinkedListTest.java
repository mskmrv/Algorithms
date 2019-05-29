package ru.geekbrains.datastructure;

import ru.geekbrains.datastructure.linkedlist.*;
import ru.geekbrains.datastructure.stack.Stack;
import ru.geekbrains.datastructure.stack.StackImpl;

public class LinkedListTest {
    public static void main(String[] args) {
//        testLinkedList();
//        testStack();
        testTwoSideLinkedList();
    }

    private static void testStack() {
        Stack<Integer> stack = new LinkedStackImpl<>();
        addToStack(stack, 1);
        addToStack(stack, 2);
        addToStack(stack, 3);
        addToStack(stack, 4);
        addToStack(stack, 5);
        addToStack(stack, 6);

        System.out.println("Top of stack is " + stack.peek());
//        stack.clear();
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    private static void addToStack(Stack<Integer> stack, int value) {
        if (!stack.isFull()) {
            stack.push(value);
        }
    }

    private static void testTwoSideLinkedList() {
        TwoSideLinkedList<Integer> linkedList = new TwoSideLinkedListImpl<>();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertLast(5);
        linkedList.insertLast(6);

        linkedList.display();
        System.out.println("Size = " + linkedList.getSize());

        linkedList.removeFirst();
        linkedList.remove(3);

        linkedList.display();

        while ((!linkedList.isEmpty())) {
            System.out.println(linkedList.removeFirst());
        }
    }

    private static void testLinkedList() {
        LinkedList<Integer> linkedList = new SimpleLinkedListImpl<>();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertFirst(5);
        linkedList.insertFirst(6);

        linkedList.display();
        System.out.println("Size = " + linkedList.getSize());

        linkedList.removeFirst();
        linkedList.remove(3);

        linkedList.display();

        while ((!linkedList.isEmpty())) {
            System.out.println(linkedList.removeFirst());
        }
    }
}
