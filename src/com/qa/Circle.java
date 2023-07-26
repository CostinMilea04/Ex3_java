package com.qa;

public class Circle extends Shape implements Movable{
    private double radius;

    public Circle(String name, String color, double x, double y, double radius) {
        super(name, color, x, y);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double getArea() {
        return this.radius * this.radius * 3.14;
    }

    @Override
    public Point getCentrePoint (){
        double x = super.getX();
        double y = super.getY();
        Point centre = new Point(x,y);
        return centre;

    }

    public Point getCurrentLocation() {
        return getCentrePoint();
    }

     public void move(double x, double y) {
         setX(getX() + x);
         setY(getY() + y);
     }


}
