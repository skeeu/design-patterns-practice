package org.example;

public class HalykBankAdapter extends PaymentProcessor {
    @Override
    void processPayment(String uid, Integer paymentId, double amount, String paymentDetails) {
        HalykBankProcessor halykBankProcessor = HalykBankProcessor.getInstance();
        halykBankProcessor.charge(uid, paymentId, amount, paymentDetails);
    }
}
