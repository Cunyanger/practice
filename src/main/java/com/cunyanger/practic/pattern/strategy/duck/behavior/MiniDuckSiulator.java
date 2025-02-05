package com.cunyanger.practic.pattern.strategy.duck.behavior;

import com.cunyanger.practic.pattern.strategy.duck.behavior.implement.MallardDuck;
import com.cunyanger.practic.pattern.strategy.duck.behavior.implement.ModelDuck;

public class MiniDuckSiulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
