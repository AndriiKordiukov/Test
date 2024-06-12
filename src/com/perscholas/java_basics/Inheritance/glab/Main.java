package com.perscholas.java_basics.Inheritance.glab;

public class Main {
    public static void main(String[] args) {



        // object creation of the Circle class
        System.out.println("--------------------");

        // it’s fine because a Circle is a Shape by inheritance
        Circle shapeCircleObj = new Circle("Yellow");  // UpCasting
        shapeCircleObj.setRadius(35);
        shapeCircleObj.displayShapeName();
        System.out.println("Area of Circle " + shapeCircleObj.getArea());
        System.out.println(shapeCircleObj);  // Run circle's toString()
        // Use instanceof operator for Validation
        System.out.println(shapeCircleObj instanceof Circle); // true

        System.out.println("--------------------");
        Shape shapeRectangleObj = new Rectangle("Red"); //UpCasting
        shapeRectangleObj.displayShapeName();
        shapeRectangleObj.setHeight(4);
        shapeRectangleObj.setWidth(8);
        System.out.println("Area of Rectangle is " + shapeRectangleObj.getArea());
        System.out.println(shapeRectangleObj);  // Run Rectangle's toString()
        // Use instanceof operator for Validation
        System.out.println(shapeRectangleObj instanceof Rectangle); // true

        System.out.println("--------------------");
        Shape shapeTriangleObj = new Triangle("Blue"); //UpCasting
        shapeTriangleObj.displayShapeName();
        shapeTriangleObj.setHeight(10);
        shapeTriangleObj.setBase(25);
        System.out.println("Area of Triangle is " + shapeTriangleObj.getArea());
        System.out.println(shapeTriangleObj);  // Run Triangle's toString()

        // Use instanceof operator for Validation
        System.out.println(shapeTriangleObj instanceof Shape); // true
        System.out.println("--------------------");

//        Cylinder cylinderShape = new Cylinder(5); //UpCasting
//        cylinderShape.displayShapeName();
//        cylinderShape.setHeight(10);
//        System.out.println("Area of Cylinder is " + cylinderShape.getVolume());
//        System.out.println(cylinderShape);  // Run cylinderShape's toString()
    }

}
