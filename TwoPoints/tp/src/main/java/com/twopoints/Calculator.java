package com.twopoints;
import java.awt.Point;

public class Calculator {
    public static double calculateDistance(Point point1, Point point2) {
        int x1 = point1.x;
        int y1 = point1.y;
        int x2 = point2.x;
        int y2 = point2.y;

        // Calculate the differences in x and y coordinates
        int deltaX = x2 - x1;
        int deltaY = y2 - y1;

        // Use the Pythagorean theorem to calculate the distance
        double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);

        return distance;
    }
}