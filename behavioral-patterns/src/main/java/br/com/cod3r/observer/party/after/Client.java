package br.com.cod3r.observer.party.after;

import br.com.cod3r.observer.party.after.observers.Friend;
import br.com.cod3r.observer.party.after.observers.Wife;
import br.com.cod3r.observer.party.after.subjects.Doorman;

public class Client {

    public static void main(String[] args) {
        Doorman doorman = new Doorman();
        doorman.attach(new Wife());
        doorman.attach(new Friend());

        System.out.println("Husband is coming");
        doorman.setStatus(true);
        doorman.setStatus(false);
    }
}
