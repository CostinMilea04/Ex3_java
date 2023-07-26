package com.qa;

public class Main {
        public static void main(String[] args) {

            Rectangle r1 = new Rectangle("first", "brown", 0,0,100,200);
            Rectangle r2 = new Rectangle("second", "red", 900,400,220,200);

            System.out.println(r1.toString());
            System.out.println(r1.getArea());
            System.out.println(r1.getCentrePoint().toString());

            Circle c = new Circle ("circle1", "red", 0,0, 10);
            Circle c2 = new Circle ("circle2", "blue", 10,10, 5);

            System.out.println(c);
            System.out.println(c2);
            System.out.println("Circle location before move: " + c.getCurrentLocation());

            c.move(10.5, 4.3);

             System.out.println("Circle location after move: " + c.getCurrentLocation());

        }
}
