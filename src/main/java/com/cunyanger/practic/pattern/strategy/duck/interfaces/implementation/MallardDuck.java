package com.cunyanger.practic.pattern.strategy.duck.interfaces.implementation;

import com.cunyanger.practic.pattern.strategy.duck.interfaces.Duck;
import com.cunyanger.practic.pattern.strategy.duck.interfaces.Flyable;
import com.cunyanger.practic.pattern.strategy.duck.interfaces.Quackable;

public class MallardDuck extends Duck implements Flyable, Quackable {

    @Override
    public void fly() {

    }

    @Override
    public void quack() {

    }
    public void display(){

    }
}
