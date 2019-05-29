import dequeue.Dequeue;
import dequeue.DequeueImpl;

public class Main31 {
    public static void main(String[] args) {
        testDequeue();
    }

    private static void testDequeue() {
        Dequeue<Integer> deq = new DequeueImpl<>(6);

        deq.insertRight(1);
        deq.insertRight(2);
        deq.insertRight(3);
        deq.insertRight(4);
        deq.insertLeft(5);
        deq.insertLeft(6);
        System.out.println(deq.getSize());
        for (int i = 0; i < deq.getSize(); i++) {
            System.out.println(deq.peek());
        }
    }
}
