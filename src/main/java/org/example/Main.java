package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // created b tree
        int bufferSize = 3;
        int numPartitions = 4;
        String storagePath = "data";
        BTree<Integer, String> btree = new BTree<>(bufferSize, numPartitions, storagePath);

        // insert test cases
        btree.insert(10, "Value 10");
        btree.insert(5, "Value 5");
        btree.insert(3, "Value 3");
        btree.insert(7, "Value 7");
        btree.insert(12, "Value 12");
        btree.insert(11, "Value 11");
        btree.insert(15, "Value 15");
        btree.insert(14, "Value 14");
        btree.insert(17, "Value 17");
        btree.insert(20, "Value 20");
        // searching
        System.out.println("Value for key 7: " + btree.search(7));
        System.out.println("Value for key 15: " + btree.search(15));
        System.out.println("Value for key 3: " + btree.search(3));
        System.out.println("Value for key 8: " + btree.search(8));

       /* // delete
        btree.delete(3);
        btree.delete(10);

        // search after delete
        System.out.println("Value for key 3: " + btree.search(3));
        System.out.println("Value for key 10: " + btree.search(10));*/
    }
}