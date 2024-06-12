package com.perscholas.java_basics.Inheritance.glab;

public class Circle extends Shape {
    protected double radius;
    protected final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(String color) {
        super.color = color;
    }

    public Circle(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        super.area = PI * Math.pow(radius, 2);
        return super.area;
    }

    @Override
    public void displayShapeName() {
                System.out.println("Drawing a Circle of radius " + radius);
    }
    @Override
    public String toString() {
        return "Circle [ radius = " + radius + " and " + super.toString() + "]";
    }
}
