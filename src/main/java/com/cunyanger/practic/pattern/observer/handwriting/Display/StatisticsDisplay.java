package com.cunyanger.practic.pattern.observer.handwriting.Display;

import com.cunyanger.practic.pattern.observer.handwriting.DisplayElement;
import com.cunyanger.practic.pattern.observer.handwriting.Observer;
import com.cunyanger.practic.pattern.observer.handwriting.Subject;

public class StatisticsDisplay implements DisplayElement, Observer {

    private Subject weatherData;
    private float temperature;
    private float humidity;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("StatisticsDisplay display");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        System.out.println("StatisticsDisplay update");
        this.display();
    }
}
