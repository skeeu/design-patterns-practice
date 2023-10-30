package org.example;

public class LunchMenuFactory extends MenuFactory {
    @Override
    public String getDescription() {
        return "Ланчи";
    }

    @Override
    public MenuItem createDish() {
        return new Dish("Курица с картофелем", 9.99);
    }

    @Override
    public MenuItem createBeverage() {
        return new Beverage("Газировка", 1.99);
    }
}