package org.example;

public abstract class MenuFactory {
    public abstract String getDescription();
    public abstract MenuItem createDish();
    public abstract MenuItem createBeverage();
}
