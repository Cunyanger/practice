package com.cunyanger.practic.pattern.decoration.concrete;

import com.cunyanger.practic.pattern.decoration.Beverage;

public class HouseBlend extends Beverage {

    @Override
    public double cost() {
        return .89;
    }

    public HouseBlend() {
        description = "House Blend Coffee";
    }
}
