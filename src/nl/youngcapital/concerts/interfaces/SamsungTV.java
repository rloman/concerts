package nl.youngcapital.concerts.interfaces;

import nl.youngcapital.concerts.model.Piano;

import java.util.Iterator;

/*
Wetten:
Je kunt ervan 1 class in Java
Je kunt meerdere interfaces implementeren
 */
public class SamsungTV implements Televisie {

    private boolean on;
    private int currentChannel;

    @Override
    public void on() {
        System.out.println("The samsung is on");
        this.on = true;
    }

    @Override
    public void off() {
        System.out.println("The samsung is off");
        this.on = false;

    }

    @Override
    public void channel(int newChannel) {
        this.currentChannel = newChannel;
    }
}
