package ru.geekbrains.datastructure.recursion;

import java.io.File;

public class ShowFiles {
    public static void main(String[] args) {
        File root = new File("d:\\Макс\\YandexDisk\\Документы\\GeekBrains\\Алгоритмы и структуры данных на Java Базовый курс\\");
        viewDir(root, "");
    }

    private static void viewDir(File currentFile, String prefix) {
        if (currentFile.isFile()) {
            System.out.println(prefix + "File: " + currentFile.getName());
        } else {
            System.out.println(prefix + "Dir: " + currentFile.getName());
            for (File file : currentFile.listFiles()) {
                viewDir(file, prefix + "    ");
            }

        }
    }
}
