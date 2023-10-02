package org.example;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = PaymentProcessor.getInstance();
        paymentProcessor.addStrategy(new KaspiStrategy());
        paymentProcessor.addStrategy(new HalykBankStrategy());

        Product water = new Product("water", 100, 12);
        Product bread = new Product("bread", 87.2, 10);

        ShoppingCart cart = new ShoppingCart();
        cart.addProductToCart(water);
        cart.addProductToCart(bread);

        paymentProcessor.checkout(cart);
    }
}