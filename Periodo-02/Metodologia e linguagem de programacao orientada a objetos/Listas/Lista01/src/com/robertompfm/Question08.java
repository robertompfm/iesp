package com.robertompfm;

import java.util.Scanner;

public class Question08 {
    public double getTwoValuesMean() {
        Scanner scn = new Scanner(System.in);
        double[] valArr = new double[2];
        int i = 0;
        while (i < 2) {
            System.out.print("Value " + (i + 1) + ": ");
            valArr[i] = scn.nextDouble();
            if (i == 1 && valArr[i] == 0) {
                System.out.println("The second value cannot be ZERO");
                System.out.println("Try again");
            } else {
                i++;
            }
        }
        return (valArr[0] + valArr[1]) / 2;
    }

    public void testGetTwoValuesMean() {
        double meanVal;
        System.out.println("Question 08 - Read two values and get their mean");
        meanVal = getTwoValuesMean();
        System.out.println("Mean value: " + meanVal);
    }
}
