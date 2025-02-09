package com.cunyanger.practic.pattern.decoration;

public abstract class Beverage {

    public String description = "Unknown Beverage";
    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
