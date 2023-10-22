package org.example;

public class PaymentApplication {
    public PaymentApplication() {}
    public void performPayment(PaymentProcessor processor, String uid, Integer paymentId, double amount, String paymentDetails) {
        processor.processPayment(uid, paymentId, amount, paymentDetails);
    }
}
