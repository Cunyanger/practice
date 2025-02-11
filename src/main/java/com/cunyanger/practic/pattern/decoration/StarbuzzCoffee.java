package com.cunyanger.practic.pattern.decoration;

import com.cunyanger.practic.pattern.decoration.concrete.Espresso;
import com.cunyanger.practic.pattern.decoration.decorator.Mocha;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        // beverage = new Mocha(beverage);
    }
}
