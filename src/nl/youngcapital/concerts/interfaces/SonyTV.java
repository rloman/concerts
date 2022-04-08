package nl.youngcapital.concerts.interfaces;

public class SonyTV implements Televisie {

    private boolean on;
    private int currentChannel;

    public void on() {
        this.on = true;
        System.out.println("Sony is on");
    }

    public void off() {
        this.on = false;
        System.out.println("Sony is off");
    }

    public void channel(int newChannel) {
        this.currentChannel = newChannel;
    }
}
