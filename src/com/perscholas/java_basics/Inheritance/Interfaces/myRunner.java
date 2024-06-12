package com.perscholas.java_basics.Inheritance.Interfaces;

public class myRunner {
    public static void main(String[] args) {

        Circle c1 = new Circle(1, 2, 2);
        c1.displayshapName();
        System.out.println("Area of Circle " + c1.getArea());
        System.out.println("Coordinates of Circle are " + c1.getCoordinate());
        System.out.println();

        Rectangle r1 = new Rectangle(0, 0, 5, 10);
        r1.displayshapName();
        System.out.println("Area of Rectangle " + r1.getArea());
        System.out.println("Coordinates of the Rectangle are " + r1.getCoordinate());
        System.out.println();

        Triangle t1 = new Triangle(-5, 6, 15, 10);
        t1.displayshapName();
        System.out.println("Area of Rectangle " + t1.getArea());
        System.out.println("Coordinates of the Triangle are " + t1.getCoordinate());
        System.out.println();

        c1.moveDown();
        System.out.println("After move Down, Coordinates are " + c1.getCoordinate());

        c1.moveRight();
        System.out.println("After move right, Coordinates are " + c1.getCoordinate());

        c1.moveUp();
        System.out.println("After move Up, Coordinates are " + c1.getCoordinate());

        c1.moveLeft();
        System.out.println("After move left, Coordinates are " + c1.getCoordinate());


        System.out.println("--------Test Polymorphism-------");
        Movable c2 = new Circle(5, 10, 200);  // upcast
        c2.moveUp();
        System.out.println("After move up , Coordinates are " + c2.getCoordinate());

        c2.moveLeft();
        System.out.println("After move Left , Coordinates are " + c2.getCoordinate());
    }
}
