package com.cunyanger.practic.pattern.strategy.duck.behavior;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
