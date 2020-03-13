package com.robertompfm;

import javax.swing.*;

public class Question14 {
    public double getTenNumbersSum() {
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += Double.parseDouble(JOptionPane.showInputDialog(null, ("Number " + (i + 1) + ":")));
        }
        return sum;
    }

    public void testGetTenNumbersSum() {
        double sum;
        System.out.println("Question 14 - Read 10 numbers and show their sum");
        sum = getTenNumbersSum();
        JOptionPane.showMessageDialog(null, "Sum: " + sum);
    }
}
