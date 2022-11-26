package com.SDA.BacaliAndrei.advanced.coding.oop.ex2;

public class Circle implements Movable , Resizable {
    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    @Override
    public void move(MoveDirection moveDirection) {
        this.center.move(moveDirection);
        this.point.move(moveDirection);

    }

    @Override
    public void resize(double resizeFactor) {
        point.move(new MoveDirection(point.getX()*resizeFactor, point.getY()*resizeFactor ));
    }

    public double getRadius(){

        return Math.sqrt(Math.pow(point.getY()- center.getY(),2)+Math.pow(point.getX()- center.getX(),2));
    }

    public double getPerimeter(){
        return 2*getRadius()*Math.PI;
    }

    public double getArea(){
        return Math.PI*Math.pow(getRadius(),2);
    }
}
