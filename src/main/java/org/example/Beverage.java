package org.example;

public class Beverage extends MenuItem {
    public Beverage(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return "Напиток: " + name;
    }
}
