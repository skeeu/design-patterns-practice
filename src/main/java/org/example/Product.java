package org.example;

public class Product {
    private double price;
    public String label;
    public String description;

    public Product(double price, String label, String description) {
        this.price = price;
        this.label = label;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
