package com.qa;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(String name, String color, double x, double y, double height, double width) {
        super(name, color, x, y);
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    public boolean isSquare() {
        if (this.height == this.width)
            return true;
        else
            return false;
    }

    @Override
    public double getArea(){
        return this.height * this.width;
    }

    @Override
    public Point getCentrePoint(){
        Point centerPoint = new Point(0,0);
        double x = super.getX() + this.width/2;
        double y = super.getY() + this.height/2;
        centerPoint.setX(x);
        centerPoint.setY(y);
        return centerPoint;

    }
}
