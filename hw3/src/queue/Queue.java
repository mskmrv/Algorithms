package queue;

import resources.ArrayImpl;

public class Queue<E extends Object & Comparable<? super E>> extends ArrayImpl<E> {
    public Queue(int capacity) {
        super(capacity);
    }

    public void insert(E value) {
        super.add(value);

    }

    public E remove() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        E value = peek();
        super.remove(value);
        return value;
    }

    public E peek() {
        E value = get(0);
        return value;
    }
}
