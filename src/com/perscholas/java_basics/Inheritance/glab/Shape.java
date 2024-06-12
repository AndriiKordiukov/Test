package com.perscholas.java_basics.Inheritance.glab;

public abstract class Shape {
    protected String color = "color";
    protected double area = 1.0;
    protected double base = 1.0;
    protected double width = 1.0;
    protected double height = 1.0;


    public void setColor(String color){
        this.color = color;
    }
    public void setArea(double area){
        this.area = area;
    }
    public void setBase(double base){
        this.base = base;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    // All shapes must provide a method called getArea()
    public abstract double getArea();
    // Returns a self-descriptive string

    @Override
    public String toString(){
        return "Shape [color=" + color + "]";
    }

    public void displayShapeName() {
        System.out.println("I am a Shape");
    }
}
