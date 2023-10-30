package org.example;

public class Waiter implements MenuObserver {
    @Override
    public void update(MenuItem dish, MenuItem beverage) {
        System.out.println("Клиент выбрал: " + dish.getDescription() + " и " + beverage.getDescription());
    }
}
