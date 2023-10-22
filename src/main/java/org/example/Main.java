package org.example;

public class Main {
    public static void main(String[] args) {
        HalykBankProcessor halykBankProcessor = HalykBankProcessor.getInstance();

        PaymentApplication paymentApplication = new PaymentApplication();

        paymentApplication.performPayment(halykBankProcessor, "21312fsdf", 123, 111, "some info");
    }
}