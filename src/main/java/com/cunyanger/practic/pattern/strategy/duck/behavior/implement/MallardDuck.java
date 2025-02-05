package com.cunyanger.practic.pattern.strategy.duck.behavior.implement;

import com.cunyanger.practic.pattern.strategy.duck.behavior.Duck;
import com.cunyanger.practic.pattern.strategy.duck.behavior.FlyWithWings;
import com.cunyanger.practic.pattern.strategy.duck.behavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("I'm a real Mallard duck");
    }
}
