package org.example;

import java.util.ArrayList;
import java.util.List;

class Menu {
    private List<MenuObserver> observers = new ArrayList<>();
    private MenuItem selectedDish;
    private MenuItem selectedBeverage;

    public void addObserver(MenuObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(MenuObserver observer) {
        observers.remove(observer);
    }

    public void selectMenuItems(MenuItem dish, MenuItem beverage) {
        selectedDish = dish;
        selectedBeverage = beverage;
        notifyObservers();
    }

    private void notifyObservers() {
        for (MenuObserver observer : observers) {
            observer.update(selectedDish, selectedBeverage);
        }
    }
}