package com.SDA.BacaliAndrei.advanced.coding.collection.Ex7;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * Create a method that accepts TreeMap and prints the first and last EntrySet in the console.
 */
public class Main {
    public static void main(String[] args) {
        TreeMap<String,String> treeMap=new TreeMap<>((o1, o2) -> o2.compareTo(o1));
        treeMap.put("BMV","X6");
        treeMap.put("Dacia","Logan");
        treeMap.put("Fiat","Punto");
        treeMap.put("Dodge","Viper");

        printFirstAndTheLastEntry(treeMap);

    }
    public static void printFirstAndTheLastEntry(TreeMap<String,String>input){
        System.out.println("First entry: "+input.firstEntry());
        System.out.println("Last entry: "+input.lastEntry());
    }

}
