package com.cunyanger.practic.pattern.strategy.duck.behavior.implement;

import com.cunyanger.practic.pattern.strategy.duck.behavior.Duck;
import com.cunyanger.practic.pattern.strategy.duck.behavior.FlyNoWay;
import com.cunyanger.practic.pattern.strategy.duck.behavior.Quack;

/**
 * 新类型 模型鸭子，默认不会飞
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
