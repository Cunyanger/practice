package com.cunyanger.practic.pattern.decoration;

public class Beverage {
    public String description = "Unknown Beverage";
    Boolean milk = false;
    Boolean soy = false;
    Boolean mocha = false;
    Boolean whip = false;

    public String getDescription() {
        return description;
    }

    public double cost() {
        return 0.0;
    }

    public Boolean hasMilk() {
        return milk;
    }

    public Boolean hasSoy() {
        return soy;
    }

    public Boolean hasMocha() {
        return mocha;
    }

    public Boolean hasWhip() {
        return whip;
    }

    public void setMilk(Boolean milk) {
        this.milk = milk;
    }

    public void setSoy(Boolean soy) {
        this.soy = soy;
    }

    public void setMocha(Boolean mocha) {
        this.mocha = mocha;
    }

    public void setWhip(Boolean whip) {
        this.whip = whip;
    }
}
