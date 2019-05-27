import queue.Queue;
import stack.Stack;

public class Main31 {
    public static void main(String[] args) {
        testQueue();
        System.out.println("-----------------");

        testStack();
        System.out.println("-----------------");

        String rString = reverseString("Строка для преобразования");
        System.out.println(rString);


    }

    private static String reverseString(String string) {
        char[] chars = string.toCharArray();
        Stack<Character> stack = new Stack<>(chars.length);
        for (char aChar : chars) {
            stack.push(aChar);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }

    private static void testStack() {
        Stack<Integer> stack = new Stack(6);

        stack.push(5);
        stack.push(4);
        stack.push(8);
        stack.push(9);
        stack.push(7);
        stack.push(12);

        System.out.println("Размер stack: " + stack.getSize());
        System.out.println(stack);

        System.out.println();

        System.out.println("Получение элемента из стека pop(): ");
        System.out.println(stack.pop());
        System.out.println("Размер stack: " + stack.getSize());
        System.out.println(stack);

        System.out.println();

        System.out.println("Получение элемента из стека pop(): ");
        System.out.println(stack.pop());
        System.out.println("Размер stack: " + stack.getSize());
        System.out.println(stack);
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
