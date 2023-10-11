package org.example;

public class Cappuccino extends Coffee{
    @Override
    public String getDescription() {
        return "This is Cappuccino";
    }
    @Override
    public double cost() {
        return 2.99;
    }
}
