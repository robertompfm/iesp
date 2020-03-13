package com.robertompfm;

public class Question13 {
    public String getNumbersFromTenToOne() {
        StringBuilder result = new StringBuilder("");
        for (int i = 10; i >= 1; i--) {
            result.append(i + "\n");
        }
        return result.toString();
    }

    public void testGetNumbersFromTenToOne() {
        System.out.println("Question 13 - Print numbers from 10 to 1");
        System.out.println(getNumbersFromTenToOne());
    }
}
