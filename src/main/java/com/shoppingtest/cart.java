package com.shoppingtest;

public class cart {
    private static boolean item=true;
    private double price = 0.00;
    private int countx;
    private String itemName = "";
    public static boolean isEmpty() {
        return item;
    }

    public double addItem(String name, double _price) {

            countx++;
            price = price + _price;
            itemName = name;

        return price;
    }
}
