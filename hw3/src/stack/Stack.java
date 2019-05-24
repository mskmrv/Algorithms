package stack;

import resources.ArrayImpl;

public class Stack<E extends Object & Comparable<? super E>> extends ArrayImpl<E> {

    public Stack(int capacity) {
        super(capacity);
    }

    public void push(E value) {
        super.add(value);
    }

    public E pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty!");
        }
        E value = super.get(getSize() - 1);
        super.remove(value);
        return value;
    }
}
