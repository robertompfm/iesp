package com.robertompfm;

import javax.swing.*;
import java.text.NumberFormat;

public class Question15 {
    private double[] stockItemsPrices;

    public void setNumberOfItems() {
        int numberOfItems = Integer.parseInt(JOptionPane.showInputDialog(null, "Number of items: "));
        stockItemsPrices = new double[numberOfItems];
    }

    public void setItemsValue() {
        for (int i = 0; i < stockItemsPrices.length; i++) {
            stockItemsPrices[i] = Double.parseDouble(JOptionPane.showInputDialog(null, ("Item " + (i + 1) + " price: ")));
        }
    }

    public double setStockItemsPriceAndGetTotal() {
        double total = 0;
        setNumberOfItems();
        setItemsValue();
        for (int i = 0; i < stockItemsPrices.length; i++) {
            total += stockItemsPrices[i];
        }
        return total;
    }

    public void testSetStockItemsPriceAndGetTotal() {
        System.out.println("Question 15 - Define number of stock items and their prices, and get total");
        double total = setStockItemsPriceAndGetTotal();
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        JOptionPane.showMessageDialog(null, "Total: " + formatter.format(total));
    }
}
