package com.perscholas.java_basics.Inheritance.glab;

public class Triangle extends Shape{
    public Triangle() {}

    public Triangle (String color, double area, double base, double width, double height) {
        this.color = color;
        this.area = area;
        this.base = base;
        this.width = width;
        this.height = height;
    }

    public Triangle (String color) {
        this.color = color;
    }
    @Override
    public void setBase(double base){
        this.base = base;
    }
    @Override
    public void setWidth(double width){
        this.width = width;
    }
    @Override
    public double getArea(){
        return 0.5*base*height;
    }
    @Override
    public void displayShapeName() {
        System.out.println("I am a Triangle");
    }
    @Override
    public String toString() {
        return "Triangle [ base = "+base+", height = "+height+", " + super.toString() + "]";
    }
}
