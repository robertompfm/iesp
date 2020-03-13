package com.robertompfm;

import java.util.Scanner;

public class Question05 {
    public double calcApplesPrice(int num) {
        if (num < 12) {
            return num * 1.3;
        } else {
            return num * 1.0;
        }
    }

    public void testCalcApplesPrice() {
        Scanner scn = new Scanner(System.in);
        int applesNum;
        double applesCost;
        System.out.println("Question 05 - Calculate the apples price");
        System.out.print("Number of apples: ");
        applesNum = scn.nextInt();
        applesCost = calcApplesPrice(applesNum);
        System.out.printf("The apples will cost $%.2f.%n", applesCost);
    }
}
