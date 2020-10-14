package com.example.project;
import java.lang.Math;

public class TriangleFinished {

    // your code goes here: good luck =)

    private double x0;
    private double y0;
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public TriangleFinished(double x0, double y0, double x1, double y1, double x2, double y2) {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public TriangleFinished() {
        this.x0 = 0;
        this.y0 = 0;
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = 0;
        this.y2 = 0;

    }

    public double area() {
        double a = Math.sqrt((x0-x1)*(x0-x1) + (y0-y1)*(y0-y1));
        double b = Math.sqrt((x0-x2)*(x0-x2) + (y0-y2)*(y0-y2));
        double c = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

        double s = (a+b+c) / 2;

        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        return area;
    }

    public double perimeter() {
        double a = Math.sqrt((x0-x1)*(x0-x1) + (y0-y1)*(y0-y1));
        double b = Math.sqrt((x0-x2)*(x0-x2) + (y0-y2)*(y0-y2));
        double c = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

        double perimeter = (a+b+c);

        return perimeter;
    }

    public void translateX(double x) {
        x0 += x;
        x1 += x;
        x2 += x;
    }

    public void translateY(double y) {
        y0 += y;
        y1 += y;
        y2 += y;
    }


    public double getx0() {
        return x0;
    }
    public double gety0() {
        return y0;
    }
    public double getx1() {
        return x1;
    }
    public double gety1() {
        return y1;
    }
    public double getx2() {
        return x2;
    }
    public double gety2() {
        return y2;
    }
}
