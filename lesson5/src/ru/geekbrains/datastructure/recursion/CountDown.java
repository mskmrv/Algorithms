package ru.geekbrains.datastructure.recursion;

public class CountDown {
    public static void main(String[] args) {
        int n = 5;
        countdownRec(5);
    }

    private static void countdownRec(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(n);
        countdownRec(--n);
    }
}
