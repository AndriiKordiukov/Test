package com.perscholas.java_basics.Inheritance.glab;

public class Rectangle extends Shape{

    public Rectangle(String color) {
        this.color = color;
    }

    public Rectangle() {}

    public Rectangle(String color, double area, double base, double width, double height) {
        this.color= color;
        this.area = area;
        this.base = base;
        this.width = width;
        this.height = height;
    }
    @Override
    public void setBase(double base) {
        this.base = base;
    }
    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea(){
        super.area = this.base*this.width;
        return super.area;
    }
    public double perimeter(){
        return (this.base + this.width)*2;
    }
    @Override
    public void displayShapeName(){
        System.out.println("Drawing a Rectangle");
    }
    @Override
    public String toString() {
        return "Rectanble [ height = " + height + ", width = "
                + width + ", " + super.toString() + "]";
    }
}
