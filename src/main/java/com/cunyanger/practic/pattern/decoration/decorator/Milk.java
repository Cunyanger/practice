package com.cunyanger.practic.pattern.decoration.decorator;

import com.cunyanger.practic.pattern.decoration.Beverage;
import com.cunyanger.practic.pattern.decoration.CondimentDecorator;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        // super(beverage);
    }
    @Override
    public String getDescription() {
        return null;
    }
}
