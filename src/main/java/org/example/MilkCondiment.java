package org.example;

public class MilkCondiment extends CondimentDecorator{
    public MilkCondiment (Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return this.coffee.cost() + 0.19;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() + ", with milk";
    }
}
