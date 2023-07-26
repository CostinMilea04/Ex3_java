package com.qa;

public class Main {
        public static void main(String[] args) {

            Rectangle r1 = new Rectangle("first", "brown", 0,0,100,200);
            Rectangle r2 = new Rectangle("second", "red", 900,400,220,200);

            System.out.println(r1.toString());
            System.out.println(r1.getArea());
            System.out.println(r1.getCentrePoint().toString());

            Circle c1 = new Circle("c1", "white", 90,80,100);

            System.out.println(c1.toString());
            System.out.println(c1.getArea());
            System.out.println(c1.getCentrePoint().toString());

        }
}
