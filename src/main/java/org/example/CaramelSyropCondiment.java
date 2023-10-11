package org.example;

public class CaramelSyropCondiment extends CondimentDecorator{

    public CaramelSyropCondiment (Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return this.coffee.cost() + 0.49;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() + ", with caramel syrop";
    }
}
