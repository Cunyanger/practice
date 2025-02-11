package com.cunyanger.practic.pattern.decoration.concrete;

import com.cunyanger.practic.pattern.decoration.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }

    public double cost() {
        return .38;
    }
}
