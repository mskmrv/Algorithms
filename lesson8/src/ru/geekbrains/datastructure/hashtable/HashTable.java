package ru.geekbrains.datastructure.hashtable;

public interface HashTable {
    boolean put(Item item, Integer cost);

    Integer get(Item item);

    boolean remove(Item irem);

    int getSize();

    boolean isEmpty();

    void display();
}
