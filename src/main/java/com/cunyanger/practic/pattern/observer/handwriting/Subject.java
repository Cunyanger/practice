package com.cunyanger.practic.pattern.observer.handwriting;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
