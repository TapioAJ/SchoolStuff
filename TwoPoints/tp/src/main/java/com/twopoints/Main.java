package com.twopoints;
import java.awt.Point;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Point point1 = new Point(1, 2);
        Point point2 = new Point(4, 6);

        double distance = calculator.calculateDistance(point1, point2);

        System.out.println("Distance between point1 and point2: " + distance);
    }
}