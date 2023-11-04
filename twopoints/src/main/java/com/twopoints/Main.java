package com.twopoints;

public class Main {
    public static void main(String[] args){
        Point pointA = new Point(20, 3);
        Point pointB = new Point(11, 29);

        System.out.println(pointA.calcDist(pointB));
    }
}