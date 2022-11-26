package com.SDA.BacaliAndrei.advanced.coding.oop.ex5;

public class Main{
    public static void main(String[] args) {
        Shape3D cube=new Cube(100);
        System.out.println("Volume of the cube is : "+cube.calculateVolume());
        System.out.println("Area of the cube is : "+cube.calculateArea());
        System.out.println("Perimeter of the cube is : "+cube.calculatePerimeter());

        cube.fill(200);
        cube.fill(2000000000);
        cube.fill(1000000.0);
    }
}
