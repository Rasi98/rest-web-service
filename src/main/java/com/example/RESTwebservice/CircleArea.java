package com.example.RESTwebservice;

import java.text.DecimalFormat;

public class CircleArea {
    private final double area;

    public CircleArea(double radius) {
        this.area = 3.1415 * radius * radius;
    }

    public double getArea() {
        final DecimalFormat df = new DecimalFormat("0.00");
        return Double.parseDouble(df.format(area));
    }
}
