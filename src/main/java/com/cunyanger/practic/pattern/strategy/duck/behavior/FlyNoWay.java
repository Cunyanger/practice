package com.cunyanger.practic.pattern.strategy.duck.behavior;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        // 什么都不做
        System.out.println("不会飞");
    }
}
