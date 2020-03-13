package com.robertompfm;

import javax.swing.*;

public class Question09 {
    public double getTwoValuesMean() {
        double[] valArr = new double[2];
        for (int i = 0; i < 2; i++) {
            valArr[i] = Double.parseDouble(JOptionPane.showInputDialog(null, ("Value " + (i + 1) + ":")));
            if (i == 1 && valArr[i] == 0) {
                JOptionPane.showMessageDialog(null, "INVALID VALUE. The second value cannot be ZERO. Please try again");
                i--;
            }
        }
        return (valArr[0] + valArr[1]) / 2;
    }

    public void testGetTwoValuesMean() {
        double meanVal;
        System.out.println("Question 09 - Read two values and get their mean");
        meanVal = getTwoValuesMean();
        JOptionPane.showMessageDialog(null, "Mean value: " + meanVal);
    }
}
