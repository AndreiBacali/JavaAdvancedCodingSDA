package com.SDA.BacaliAndrei.advanced.coding.collection.Ex9;

public class Main {
    public static void main(String[] args) {
        Zoo zoo=new Zoo();
        zoo.addAnimals("giraffe",2);
        zoo.addAnimals("elephant",4);
        zoo.addAnimals("elephant",2);
        zoo.addAnimals("lion",9);

        System.out.println(zoo.getAnimalsCount());
        System.out.println(zoo.getNumberOfAllAnimals());
    }
}
