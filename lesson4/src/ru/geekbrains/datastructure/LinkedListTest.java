package ru.geekbrains.datastructure;

import ru.geekbrains.datastructure.linkedlist.LinkedList;
import ru.geekbrains.datastructure.linkedlist.SimpleLinkedListImpl;

public class LinkedListTest {
    public static void main(String[] args) {
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
