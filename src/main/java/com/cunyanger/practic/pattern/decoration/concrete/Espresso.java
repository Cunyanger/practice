package com.cunyanger.practic.pattern.decoration.concrete;

import com.cunyanger.practic.pattern.decoration.Beverage;

public class Espresso extends Beverage {
    @Override
    public double cost() {
        return 1.99;
    }
    public Espresso() {
        description = "Espresso";
    }
}
