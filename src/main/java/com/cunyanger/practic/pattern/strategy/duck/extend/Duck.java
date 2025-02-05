package com.cunyanger.practic.pattern.strategy.duck.extend;

public class Duck {
    public void quack(){}
    public void swim(){}
    public void display(){}
    // 导致橡皮鸭子也会飞,每一个新种类的鸭子都需要用空方法覆盖不需要的方法
    public void fly(){}
}