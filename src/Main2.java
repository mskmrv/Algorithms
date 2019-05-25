import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main2 {

    private static final int INITIAL_CAPACITY = 10000;

    public static void main(String[] args) {
//        testArray();
//        testSort(); // from lesson

        Array<Integer> array = new ArrayImpl<>(INITIAL_CAPACITY);
        fillArray(array);

        Array<Integer> arrayCopy = getCopy(array);
        doSortBuble(arrayCopy);

        System.out.println();

        arrayCopy = getCopy(array);
        doSortSelect(arrayCopy);

        System.out.println();

        arrayCopy = getCopy(array);
        doSortInsert(arrayCopy);

    }

    private static void doSortInsert(Array<Integer> arrayCopy) {
        long start = System.nanoTime();
        arrayCopy.sortInsert();
        long finish = System.nanoTime();
        long duration = finish - start;
        System.out.println("Продолжительность сортировки вставкой: " + duration + " наносекунд");
        long durMlsec = TimeUnit.NANOSECONDS.toMillis(duration);
        System.out.println(durMlsec + " мсек");
    }

    private static void doSortSelect(Array<Integer> arrayCopy) {
        long start = System.nanoTime();
        arrayCopy.sortSelect();
        long finish = System.nanoTime();
        long duration = finish - start;
        System.out.println("Продолжительность сортировки выбором: " + duration + " наносекунд");
        long durMlsec = TimeUnit.NANOSECONDS.toMillis(duration);
        System.out.println(durMlsec + " мсек");
    }

    private static void doSortBuble(Array<Integer> arrayCopy) {
        long start = System.nanoTime();
        arrayCopy.sortBubble();
        long finish = System.nanoTime();
        long duration = finish - start;
        System.out.println("Продолжительность пузырьковой сортировки : " + duration + " наносекунд");
        long durMlsec = TimeUnit.NANOSECONDS.toMillis(duration);
        System.out.println(durMlsec + " мсек");
    }

    private static Array<Integer> getCopy(Array<Integer> array) {
        Array<Integer> copy = new ArrayImpl<>(INITIAL_CAPACITY);
        for (int i = 0; i < array.getSize(); i++) {
            copy.add(array.get(i));
        }
        return copy;
    }

    private static void fillArray(Array<Integer> array) {
        Random rnd = new Random();
        for (int i = 0; i < INITIAL_CAPACITY; i++) {
            array.add(Math.abs(rnd.nextInt()));
        }
    }

    private static void testSort() {
        Array<Integer> array = new ArrayImpl<>();
        array.add(2);
        array.add(1);
        array.add(4);
        array.add(5);
        array.add(3);
        System.out.println(array);
//        array.sortBubble();
//        array.sortSelect();
        array.sortInsert();
        System.out.println(array);
    }

    public static void testArray() {
//        Array<Integer> array = new ArrayImpl<>();
        Array<Integer> array = new SortedArrayImpl<>();
        System.out.println(array);
        array.add(2);
        array.add(1);
        array.add(4);
        array.add(5);
        array.add(3);
        System.out.println(array);

        System.out.println("Find 5 = " + array.contains(5));
        System.out.println("Index of 3 = " + array.indexOf(3));
        System.out.println("Index of 33 = " + array.indexOf(33));

        System.out.println("Remove 3: " + array.remove(3));
        System.out.println("Remove 33: " + array.remove(33));
        System.out.println("Index of 3 = " + array.indexOf(3));

        System.out.println(array);
        System.out.println("Size is: " + array.getSize());

        System.out.println("------------");
        for (int i = 0; i < array.getSize(); i++) {
            System.out.println(array.get(i));
        }
    }
}
