package org.example;

public class Dish extends MenuItem {
    public Dish(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return "Блюдо: " + name;
    }
}


