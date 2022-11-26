package com.SDA.BacaliAndrei.advanced.coding.oop.ex5;

public class Cube extends Shape3D {
    double length;

    public Cube(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double calculatePerimeter() {
        return 12*length;
    }

    @Override
    public double calculateArea() {
        return 6*Math.pow(length,2);
    }

    @Override
    public double calculateVolume() {
        return Math.pow(length,3);
    }
}
