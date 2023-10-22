package org.example;

public class KaspiProcessor extends PaymentProcessor {
    @Override
    void processPayment(String uid, Integer paymentId, double amount, String paymentDetails) {
        System.out.println("Successfull payment");
    }
}
