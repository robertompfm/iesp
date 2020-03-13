package com.robertompfm;

import javax.swing.*;

public class Question11 {
    public double getTwoGradesMean() {
        double[] valArr = new double[2];
        int i = 0;
        while (i < 2) {
            valArr[i] = Double.parseDouble(JOptionPane.showInputDialog(null, ("Grade " + (i + 1) + ":")));
            if (valArr[i] < 0 || valArr[i] > 10) {
                JOptionPane.showMessageDialog(null, "INVALID VALUE. The grade has to be a value between 0 and 10. Please try again");
            } else {
                i++;
            }
        }
        return (valArr[0] + valArr[1]) / 2;
    }

    public void testGetTwoGradesMean() {
        double meanVal;
        System.out.println("Question 11 - Read two grades of a student and show their mean");
        meanVal = getTwoGradesMean();
        JOptionPane.showMessageDialog(null, "Mean value: " + meanVal);
    }
}
