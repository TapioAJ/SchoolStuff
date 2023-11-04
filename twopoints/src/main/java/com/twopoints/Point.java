package com.twopoints;

public class Point {
    int x;
    int y;
     public Point(int x, int y){
        this.x = x;
        this.y = y;
     }

     public int getX(){
        return x;
     }

     public int getY(){
        return y;
     }

     public double calcDist(Point p){
        return Math.sqrt((p.getX() - x) * (p.getX() - x) + (p.getY() - y) * (p.getY() - y));
     }
}
