package com.cunyanger.practic.pattern.decoration.decorator;

import com.cunyanger.practic.pattern.decoration.Beverage;
import com.cunyanger.practic.pattern.decoration.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return "Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
