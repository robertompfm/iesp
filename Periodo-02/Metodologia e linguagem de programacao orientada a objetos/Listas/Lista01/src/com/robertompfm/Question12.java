package com.robertompfm;

public class Question12 {
    public String getNumbersFromOneToTen() {
        StringBuilder result = new StringBuilder("");
        for (int i = 1; i <= 10; i++) {
            result.append(i + "\n");
        }
        return result.toString();
    }

    public void testGetNumbersFromOneToTen() {
        System.out.println("Question 12 - Print numbers from 1 to 10");
        System.out.println(getNumbersFromOneToTen());
    }
}
