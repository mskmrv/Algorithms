package dequeue;

public class DequeueImpl<E> implements Dequeue<E> {
    private static final int DEFAULT_REAR = -1;
    private static final int DEFAULT_FRONT = 0;
    protected E[] data;
    protected int size;
    private int front;
    private int rear;

    @SuppressWarnings("unchecked")
    public DequeueImpl(int maxSize) {
        this((E[]) new Object[maxSize]);
    }

    protected DequeueImpl(E[] data) {
        this.data = data;
        this.front = DEFAULT_FRONT;
        this.rear = DEFAULT_REAR;
    }

    @Override
    public void insertLeft(E value) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        /*if (rear == data.length - 1) {
            rear = DEFAULT_REAR;
        }
        data[++rear] = value;
        size++;*/

        if (front - 1 < 0) {
            front = data.length;
            data[--front] = value;
            size++;
        }
    }

    @Override
    public void insertRight(E value) {

    }

    @Override
    public E removeLeft() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        if (front == data.length) {
            front = DEFAULT_FRONT;
        }
        E value = data[front++];
        size--;
        return value;
    }

    @Override
    public E removeRight() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        /*if (front == data.length) {
            front = DEFAULT_FRONT;
        }
        E value = data[front++];
        size--;
        return value;*/

        if (rear < 0) {
            rear = data.length - 1;
        }
        size--;
        return data[rear--];
    }

    @Override
    public void insert(E value) {
        throw new RuntimeException("Не указана позиция для вставки элемента");
    }

    @Override
    public E remove() {
        throw new RuntimeException("Не указана позиция для удаления элемента");
    }

    @Override
    public E peek() {
        return data[front];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public int getSize() {
        return size;
    }
}
