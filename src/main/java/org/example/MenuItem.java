package org.example;

public abstract class MenuItem {
    public String name;
    protected double price;

    public double getPrice() {
        return price;
    }

    public abstract String getDescription();
}
