package ru.geekbrains.datastructure.tree;

public class Main6 {
    public static void main(String[] args) {
        Tree<Integer> tree = new TreeImpl<>();
        tree.add(60);
        tree.add(25);
        tree.add(66);
        tree.add(15);
        tree.add(5);
        tree.add(20);
        tree.add(45);
        tree.add(30);
        tree.add(32);
        tree.add(55);

        System.out.println("Find 32 is " + tree.find(32));
        System.out.println("Find 60 is " + tree.find(60));
        System.out.println("Find 25 is " + tree.find(25));
        System.out.println("Find 555 is " + tree.find(555));

        System.out.println("------------------");

        tree.display();
//        tree.remove(5);
//        tree.remove(30);
        tree.remove(25);
        tree.display();

//        tree.traverse(Tree.TraverseMode.IN_ORDER);
//        tree.traverse(Tree.TraverseMode.PRE_ORDER);
//        tree.traverse(Tree.TraverseMode.IN_ORDER);
    }
}
