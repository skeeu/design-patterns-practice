package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeShop {
    private List<Coffee> availableCoffees = new ArrayList<>();
    private List<Class<? extends CondimentDecorator>> availableCondiments = new ArrayList<>();

    public CoffeeShop() {
        availableCoffees.add(new Cappuccino());
        availableCoffees.add(new Americano());

        availableCondiments.add(SugarCondiment.class);
        availableCondiments.add(CaramelSyropCondiment.class);
        availableCondiments.add(MilkCondiment.class);
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        List<Coffee> coffees = new ArrayList<>();
        System.out.println("Welcome to the Coffee Shop!");

        while (true) {
            System.out.println("Select coffee:");
            for (int i = 0; i < availableCoffees.size(); i++) {
                System.out.println(i + 1 + ". " + availableCoffees.get(i).getDescription());
            }
            System.out.println("0. Finish");
            int coffeeChoice = scanner.nextInt();

            if (coffeeChoice == 0) {
                break;
            }

            Coffee selectedCoffee = availableCoffees.get(coffeeChoice - 1);
            System.out.println("Selected: " + selectedCoffee.getDescription());

            while (true) {
                System.out.println("Select condiment:");
                for (int i = 0; i < availableCondiments.size(); i++) {
                    System.out.println(i + 1 + ". " + availableCondiments.get(i).getSimpleName());
                }
                System.out.println("0 - Done");

                int condimentChoice = scanner.nextInt();

                if (condimentChoice == 0) {
                    break;
                }

                if (condimentChoice >= 1 && condimentChoice <= availableCondiments.size()) {
                    Class<? extends CondimentDecorator> selectedCondimentClass = availableCondiments.get(condimentChoice - 1);
                    try {
                        selectedCoffee = selectedCondimentClass.getDeclaredConstructor(Coffee.class).newInstance(selectedCoffee);
                        System.out.println("Added: " + selectedCondimentClass.getSimpleName());
                    } catch (Exception e) {
                        System.out.println("Error adding condiment.");
                    }
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            }

            coffees.add(selectedCoffee);
        }

        System.out.println("Your order:");

        for (Coffee coffee : coffees) {
            System.out.println(coffee.getDescription() + ". Total cost: " + coffee.cost());
        }
    }
}
