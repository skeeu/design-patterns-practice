package org.example;

public class HalykBankProcessor {
    private static HalykBankProcessor instance;

    private HalykBankProcessor(){};

    public static HalykBankProcessor getInstance() {
        if (instance == null) {
            instance = new HalykBankProcessor();
        }
        return instance;
    }

    public void charge(String uid, Integer paymentId, double amount, String paymentDetails) {
        System.out.println("Successfull payment");
    }
}
