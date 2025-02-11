package com.cunyanger.practic.pattern.decoration.concrete;

import com.cunyanger.practic.pattern.decoration.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    public double cost() {
        return .99;
    }
}
