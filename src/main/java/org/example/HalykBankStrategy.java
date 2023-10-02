package org.example;

public class HalykBankStrategy implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Checking out with halykbank. Amount: " + amount);
    }

    @Override
    public String getName() {
        return "HalyBank";
    }
}
