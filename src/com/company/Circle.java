package com.company;

public class Circle extends Shape{
    private Double radius;

    public Circle(){
        super();
        this.radius = 1.0;
    }

    public Circle(Double radius){
        super();
        this.radius = radius;
    }

    public Circle(String color, Boolean filled, Double radius){
        super(color, filled);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getArea(){
        return 3.14 * Math.pow(getRadius(), 2);
    }

    public Double getPerimeter(){
        return 2 * 3.14 * getRadius();
    }

    @Override
    public String toString() {
        return "Circle{" + super.toString() +
                ",radius=" + radius +
                '}';
    }
}
