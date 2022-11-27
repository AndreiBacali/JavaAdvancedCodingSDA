package com.SDA.BacaliAndrei.advanced.coding.oop.ex9;

/**
 * Extend the ArrayList class by implementing the getEveryNthElement() method.
 * This method returns a list of elements and takes two parameters:
 * the element index from which it starts and a number specifying which element to choose.
 * For the list: [a, b, c, d, e, f, g] and parameters: startIndex = 2 and skip = 3 it should return [c, g]
 */

public class Main {
    public static void main(String[] args) {
        SDAArrayList<String>listOfString=new SDAArrayList<>();
        listOfString.add("a");
        listOfString.add("b");
        listOfString.add("v");
        listOfString.add("c");
        listOfString.add("d");
        listOfString.add("e");
        listOfString.add("f");
        listOfString.add("h");
        System.out.println(listOfString.getEveryNthElement( 2,3));
        System.out.println(listOfString.getEveryNthElement(10,3));
        System.out.println(listOfString.getEveryNthElement(3,-3));
    }
}
