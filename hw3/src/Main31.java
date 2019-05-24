import queue.Queue;

public class Main31 {
    public static void main(String[] args) {
        testQueue();
    }

    private static void testQueue() {
        Queue<Integer> queue = new Queue<>(6);

        queue.insert(5);
        queue.insert(4);
        queue.insert(8);
        queue.insert(9);
        queue.insert(7);
        queue.insert(12);

        System.out.println("Размер queue: " + queue.getSize());
        System.out.println(queue);

        System.out.println();

        System.out.println("Поиск первого элемента: peek():");
        System.out.println(queue.peek());
        System.out.println(queue);


        System.out.println();

        System.out.println("Производим удаление элемента");
        System.out.println(queue.remove());
        System.out.println("Размер queue: " + queue.getSize());
        System.out.println(queue);

        System.out.println();

        System.out.println("Производим удаление элемента");
        System.out.println(queue.remove());
        System.out.println("Размер queue: " + queue.getSize());
        System.out.println(queue);
    }
}
