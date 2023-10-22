package org.example;

public abstract class PaymentProcessor {
    abstract void processPayment(String uid, Integer paymentId, double amount, String paymentDetails);
}
