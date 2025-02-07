package com.cunyanger.practic.pattern.observer.handwriting.Display;

import com.cunyanger.practic.pattern.observer.handwriting.DisplayElement;
import com.cunyanger.practic.pattern.observer.handwriting.Observer;
import com.cunyanger.practic.pattern.observer.handwriting.Subject;

public class ForecastDisplay implements DisplayElement, Observer {

    private float currentPressure = 29.92f;
    private float lastPressure;
    private Subject weatherData;
    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("ForecastDisplay.display");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("ForecastDisplay.update");
        this.display();
    }
}
