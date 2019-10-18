package com.company;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public  double area() {
        // obsah

        return Math.PI * (radius * radius);
    }

    public double  circumference() {
        return  2 * Math.PI *radius ;
    }

}
