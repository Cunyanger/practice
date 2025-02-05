package com.cunyanger.practic.pattern.strategy.duck.behavior;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("使用火箭动力飞行");
    }
}
