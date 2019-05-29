package iterator;

import ru.geekbrains.datastructure.linkedlist.LinkedList;
import ru.geekbrains.datastructure.linkedlist.SimpleLinkedListImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
    public static void main(String[] args) {
        int array[] = {1, 2, 3};
        for (int i = 0; i < array.length - 1; i++) {
            int value = array[i];
            System.out.println(value);
        }

        LinkedList<Integer> linkedList = new SimpleLinkedListImpl<>();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);

        for (Integer integer : linkedList) {
            System.out.println(integer);
        }

        System.out.println("-------------");
        System.out.println("display " + linkedList.getClass().getSimpleName());
        SimpleLinkedListImpl.Entry<Integer> current = linkedList.getFirst();
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
        System.out.println("-------------JDK-----");

        List<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);

        Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
        }

        for (Integer integer : collection) {
            System.out.println(integer);
        }
    }
}
