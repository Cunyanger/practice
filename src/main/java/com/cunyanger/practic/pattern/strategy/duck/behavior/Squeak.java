package com.cunyanger.practic.pattern.strategy.duck.behavior;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.printf("吱吱");
    }
}
