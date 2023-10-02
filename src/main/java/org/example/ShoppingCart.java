package org.example;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> cart;

    public ShoppingCart() {
        this.cart = new ArrayList<>();
    }

    public void addProductToCart(Product p) {
        cart.add(p);
        System.out.println("Product added to cart");
    }

    public double totalPrice () {
        double total = 0;
        for (Product p: cart) {
            total += p.totalPrice();
        }
        return total;
    }
}
