package com.perscholas.java_basics.Inheritance.glab;

public class Cylinder extends Circle{
    private final double PI = Math.PI;

    public Cylinder(double radius, double height) {
        super(radius, height);
    }
    public Cylinder(double radius) {
        super(radius);
    }

    @Override
    public double getArea() {
        super.area = PI * Math.pow(radius, 2);
        return super.area;
    }
    public double getVolume() {
        return getArea() * super.height;
    }

    public double getSurfaceArea() {
        return super.height * PI + (2*getArea());
    }
    /** Returns the volume of this cylinder */
    public double getVolumne() {
        return  (PI*Math.pow(super.radius, 2)) * super.height;
    }

    @Override
    public void displayShapeName(){
        System.out.println("Drawing a Cylinder for radius " + super.radius);
    }
    @Override
    public String toString() {
        return " Cylinder [ radius = " + radius + " height is: "
                + height;
    }

}
