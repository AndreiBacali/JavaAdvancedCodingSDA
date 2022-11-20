package com.SDA.BacaliAndrei.advanced.coding.collection.Ex3;
/**
 * Create a method that takes the map as a parameter,
 * where the key is string and the value number,
 * and then prints each map element to the console in the format: Key: ,
 * Value: . There should be a comma at the end of every line except the last,
 * and a period at the last. Example: Key: Java, Value: 18, Key: Python, Value: 1, … Key: PHP, Value: 0.
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("Java", 18);
        stringIntegerMap.put("Python", 1);
        stringIntegerMap.put("PHP", 0);

        printMapContent(stringIntegerMap);
        System.out.println("--------------------");
        printMapContentV2(stringIntegerMap);
    }


    public static void printMapContent(Map<String, Integer> inputMapContent) {

        Set<Map.Entry<String, Integer>> entries = inputMapContent.entrySet();
        for (Map.Entry<String, Integer> el : entries) {
            System.out.println("Key" + el.getKey() + " , " + "Value" + el.getValue());
        }

    }

    public static void printMapContentV2(Map<String, Integer> inputMapContent) {

        Set<Map.Entry<String, Integer>> entries = inputMapContent.entrySet();
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(entries);
        for (int i = 0; i < entryList.size(); i++) {
            String endOfLine;
            if (i < entryList.size() - 1) {
                endOfLine=",";
            } else {
                endOfLine=".";
            }
            System.out.println("Key" + entryList.get(i).getKey() + " , " + "Value" + entryList.get(i).getValue());
        }
    }
}
