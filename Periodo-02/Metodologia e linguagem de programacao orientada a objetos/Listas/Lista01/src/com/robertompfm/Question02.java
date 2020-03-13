package com.robertompfm;

import java.util.Scanner;

public class Question02 {
    public double getRectArea(double width, double height) {
        return width * height;
    }

    public void testGetRectArea() {
        Scanner scn = new Scanner(System.in);
        double width, height, area;
        System.out.println("Question 02 - Rectangle Area");
        System.out.print("Width: ");
        width = scn.nextDouble();
        System.out.print("Height: ");
        height = scn.nextDouble();
        area = getRectArea(width, height);
        System.out.println("Area: " + area);
    }
}
