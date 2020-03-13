package com.robertompfm;

import java.util.Scanner;

public class Question03 {
    public boolean checkIfGreaterThanTen(double num) {
        return num > 10;
    }

    public void testCheckIfGreaterThanTen() {
        Scanner scn = new Scanner(System.in);
        double num;
        System.out.println("Question 03 - Check if a number is greater than 10");
        System.out.print("Number: ");
        num = scn.nextDouble();
        if (checkIfGreaterThanTen(num)) {
            System.out.println("The number is greater than 10!");
        } else {
            System.out.println("The number is not greater than 10");
        }
    }
}
