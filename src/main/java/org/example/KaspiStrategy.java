package org.example;

public class KaspiStrategy implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Checking out with kaspi. Amount: " + amount);
    }

    @Override
    public String getName() {
        return "Kaspi";
    }
}
