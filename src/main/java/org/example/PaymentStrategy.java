package org.example;

public interface PaymentStrategy {
    void processPayment(double amount);
    String getName();
}
