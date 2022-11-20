package com.SDA.BacaliAndrei.advanced.coding.collection.Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Ex 2 Create a method that takes a string list as a parameter,
 * then returns that list sorted alphabetically from Z to A case-insensitive.
 */

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("C");
        list.add("D");
        list.add("z");


        System.out.println(list(list));

    }

    public static List<String> list(List<String>input ){
        return input.stream()
                .sorted((o1, o2) -> o2.compareToIgnoreCase(o1))
                .collect(Collectors.toList());
    }
}
