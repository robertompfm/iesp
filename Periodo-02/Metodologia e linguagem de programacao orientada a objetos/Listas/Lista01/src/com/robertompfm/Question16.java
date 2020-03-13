package com.robertompfm;

public class Question16 {
    public String getMultiplicationTables() {
        StringBuilder tables = new StringBuilder("");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                tables.append(i + " x " + j + " = " + (i * j) + "\n");
            }
            tables.append("\n");
        }
        return tables.toString();
    }

    public void testGetMultiplicationTables() {
        System.out.println("Question 16 - Multiplication tables 1 to 10");
        System.out.println(getMultiplicationTables());
    }


}
