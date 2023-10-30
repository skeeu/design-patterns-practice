package org.example;

public class BreakfastMenuFactory extends MenuFactory {
    @Override
    public String getDescription() {
        return "Завтраки";
    }

    @Override
    public MenuItem createDish() {
        return new Dish("Омлет", 6.99);
    }

    @Override
    public MenuItem createBeverage() {
        return new Beverage("Апельсиновый сок", 2.49);
    }
}
