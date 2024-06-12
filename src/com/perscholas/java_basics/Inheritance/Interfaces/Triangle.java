package com.perscholas.java_basics.Inheritance.Interfaces;

public class Triangle extends Shape implements Movable {
    protected double base;
    protected double height;
    private int x, y;   // x and y coordinates of the point

    /** Constructs a MovablePoint instance at the given x and y */
    public Triangle(int x, int y, double base, double height) {
        this.x = x;
        this.y = y;
        this.base = base;
        this.height = height;
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        double area = this.base * this.height / 2; // initializing value in parent class variable
        return area; //reference to  parent class variable
    }
    @Override
    public void displayshapName() {
        System.out.println("Drawing a Triangle with base " + this.base
                + " and height " + this.height);
    }
    /** Returns a self-descriptive string */
    @Override
    public String toString() {
        return "Triangle [ base = " + base + super.toString()
                + ", height = " + height + "] ";
    }

    public String getCoordinate()
    {
        return  "(" + x + "," + y + ")";
    }

    // Need to implement all the abstract methods defined in the interface Movable
    @Override
    public void moveUp() {
        y++;
    }
    @Override
    public void moveDown() {
        y--;
    }
    @Override
    public void moveLeft() {
        x--;
    }
    @Override
    public void moveRight() {
        x++;
    }
}
