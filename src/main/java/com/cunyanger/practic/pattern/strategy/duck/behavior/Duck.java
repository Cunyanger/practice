package com.cunyanger.practic.pattern.strategy.duck.behavior;

public abstract class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;
    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }
    public abstract void display();
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    // 动态设定方法，可以随时修改行为
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

}
