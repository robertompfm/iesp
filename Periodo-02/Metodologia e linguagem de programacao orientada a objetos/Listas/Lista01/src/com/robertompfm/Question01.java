package com.robertompfm;

import java.util.Scanner;

public class Question01 {
    public int calcAgeInDays(int ageInYears) {
        int ageInDays = ageInYears * 365;
        return ageInDays;
    }

    public void testCalcAgeInDays() {
        Scanner scn = new Scanner(System.in);
        int ageInYears, ageInDays;
        System.out.println("Question 01 - Age in Days Calculator");
        System.out.print("Age in years: ");
        ageInYears = scn.nextInt();
        ageInDays = calcAgeInDays(ageInYears);
        System.out.println("Age in days: " + ageInDays);
    }
}
