package org.example;

public class Main {
    public static void main(String[] args) {
        KaspiProcessor kaspiProcessor = new KaspiProcessor();
        HalykBankAdapter halykBankAdapter = new HalykBankAdapter();

        PaymentApplication paymentApplication = new PaymentApplication();

        paymentApplication.performPayment(kaspiProcessor, "21312fsdf", 123, 111, "some info");
        paymentApplication.performPayment(halykBankAdapter, "21312fsdf", 123, 111, "some info");
    }
}