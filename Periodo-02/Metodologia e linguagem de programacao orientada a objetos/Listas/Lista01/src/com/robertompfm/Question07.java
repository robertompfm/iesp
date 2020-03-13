package com.robertompfm;

import java.util.Scanner;

public class Question07 {
    public double getTwoValuesMean() {
        Scanner scn = new Scanner(System.in);
        double[] valArr = new double[2];
        for (int i = 0; i < 2; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            valArr[i] = scn.nextDouble();
            if (i == 1 && valArr[i] == 0) {
                System.out.println("The second value cannot be ZERO");
                System.out.println("Try again");
                i--;
            }
        }
        return (valArr[0] + valArr[1]) / 2;
    }

    public void testGetTwoValuesMean() {
        double meanVal;
        System.out.println("Question 07 - Read two values and get their mean");
        meanVal = getTwoValuesMean();
        System.out.println("Mean value: " + meanVal);
    }
}
