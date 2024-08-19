package br.com.cod3r.observer.party.after.subjects;

import br.com.cod3r.observer.party.after.observers.Observer;

import java.util.HashSet;
import java.util.Set;

public abstract class Subject {
    private final Set<Observer> observers = new HashSet<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(boolean status) {
        for (Observer o : observers) {
            o.update(status);
        }
    }
}
