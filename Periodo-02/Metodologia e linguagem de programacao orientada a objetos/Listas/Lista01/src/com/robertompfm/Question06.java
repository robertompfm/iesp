package com.robertompfm;

import java.util.Scanner;

public class Question06 {
    public double calcWeightedAverage(double num1, double num2, double num3) {
        return (num1 * 4 + num2 * 3 + num3 * 3) / 10;
    }

    public double getGradeAverage(double grade01, double grade02, double grade03) {
        if (grade01 >= grade02 && grade01 >= grade03) {
            return calcWeightedAverage(grade01, grade02, grade03);
        } else if (grade02 >= grade01 && grade02 >= grade03) {
            return calcWeightedAverage(grade02, grade01, grade03);
        } else {
            return calcWeightedAverage(grade03, grade01, grade02);
        }
    }

    public boolean checkIfApproved(double average) {
        return average >= 5;
    }

    public String getGradeReport(String code, double grade01, double grade02, double grade03) {
        StringBuilder report = new StringBuilder("");
        double wAverage = getGradeAverage(grade01, grade02, grade03);
        report.append("Grade report for the student " + code + "\n");
        report.append("Student code: " + code + "\n");
        report.append("Grade 01: " + grade01 + "\n");
        report.append("Grade 02: " + grade02 + "\n");
        report.append("Grade 03: " + grade03 + "\n");
        report.append("Weighted average: " + wAverage + "\n");
        if (checkIfApproved(wAverage)) {
            report.append("Status: APPROVED\n");
        } else {
            report.append("Status: FAILED\n");
        }
        return report.toString();
    }

    public void testGetGradeReport() {
        Scanner scn = new Scanner(System.in);
        String studentCode;
        double grade01, grade02, grade03;
        System.out.println("Question 06 - School Subject Report");
        System.out.println("Inform your student code and your grades");
        System.out.print("Student code: ");
        studentCode = scn.nextLine();
        System.out.print("Grade 01: ");
        grade01 = scn.nextInt();
        System.out.print("Grade 02: ");
        grade02 = scn.nextInt();
        System.out.print("Grade 03: ");
        grade03 = scn.nextInt();
        System.out.println("\n===================");
        System.out.println(getGradeReport(studentCode, grade01, grade02, grade03));
    }

}
