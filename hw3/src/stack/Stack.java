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
        int index = getSize() - 1;
        E value = super.get(index);
        remove(index);
        return value;
    }

    private void remove(int index) {
        super.data[index] = null;
        super.currentSize--;
    }
}
