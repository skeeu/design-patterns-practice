package org.example;

public class SugarCondiment extends CondimentDecorator{
    public SugarCondiment (Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return this.coffee.cost() + 0.05;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() + ", with sugar";
    }
}
