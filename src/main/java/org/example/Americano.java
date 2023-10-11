package org.example;

public class Americano extends Coffee {
    @Override
    public String getDescription() {
        return "This is Americano";
    }

    @Override
    public double cost() {
        return 2.49;
    }
}
