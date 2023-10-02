package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaymentProcessor {
    private List<PaymentStrategy> strategies;
    private Scanner scanner;

    private PaymentProcessor(){
        strategies = new ArrayList<>();
        scanner = new Scanner(System.in);
    };

    private static class PaymentProcessorHolder{
        public static final PaymentProcessor instance = new PaymentProcessor();
    }

    public static PaymentProcessor getInstance(){
        return PaymentProcessorHolder.instance;
    }

    public void addStrategy(PaymentStrategy strategy) {
        strategies.add(strategy);
    }

    public void showStrategies() {
        System.out.println("Available Payment Strategies:");
        for(int i = 0; i < strategies.size(); i++) {
            System.out.println((i + 1) + ". " + strategies.get(i).getName());
        }
    }

    public void checkout(ShoppingCart cart) {
        this.showStrategies();
        System.out.print("Enter the number of the payment strategy (or 0 to cancel): ");
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= strategies.size()) {
            // User selected a valid strategy
            strategies.get(choice - 1).processPayment(cart.totalPrice());
        } else if (choice == 0) {
            System.out.println("Payment strategy canceled.");
        } else {
            System.out.println("Invalid choice. Payment strategy not selected.");
        }
    }
}
