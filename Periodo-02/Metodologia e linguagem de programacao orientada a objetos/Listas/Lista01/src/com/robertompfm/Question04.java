package com.robertompfm;

import java.util.Scanner;

public class Question04 {
    public boolean checkIfPositive(double num) {
        return num >= 0;
    }

    public void testCheckIfPositive() {
        Scanner scn = new Scanner(System.in);
        double num;
        System.out.println("Question 04 - Check if a number is positive or negative");
        System.out.print("Number: ");
        num = scn.nextDouble();
        if (checkIfPositive(num)) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }
    }
}
