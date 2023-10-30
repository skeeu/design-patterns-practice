package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<MenuFactory> menuFactoryList = new ArrayList<>();
        menuFactoryList.add(new BreakfastMenuFactory());
        menuFactoryList.add(new LunchMenuFactory());

        Scanner scanner = new Scanner(System.in);

        Menu menu = new Menu();

        Waiter waiter = new Waiter();

        menu.addObserver(waiter);

        while (true) {
            System.out.println("Выберите меню: ");
            for(int i = 0; i < menuFactoryList.size(); i++) {
                System.out.println(i + ". " + menuFactoryList.get(i).getDescription());
            }

            int choice = scanner.nextInt();
            if (choice >= 0 && choice < menuFactoryList.size()) {
                MenuFactory selectedFactory = menuFactoryList.get(choice);
                MenuItem dish = selectedFactory.createDish();
                MenuItem beverage = selectedFactory.createBeverage();

                System.out.println("Выбрано: " + dish.getDescription() + ", Цена: $" + dish.getPrice());
                System.out.println("Выбрано: " + beverage.getDescription() + ", Цена: $" + beverage.getPrice());

                menu.selectMenuItems(dish, beverage);
            } else {
                System.out.println("Неверный выбор меню.");
            }
        }
    }
}