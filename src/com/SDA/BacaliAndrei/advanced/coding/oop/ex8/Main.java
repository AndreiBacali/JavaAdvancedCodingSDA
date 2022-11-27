package com.SDA.BacaliAndrei.advanced.coding.oop.ex8;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Joiner<Integer>joinerInteger=new Joiner<>("-");

        System.out.println(joinerInteger.join(List.of(1,2,3,4,5)));
    }
}
