package nl.youngcapital.concerts.model;

public class Guitar extends Instrument {

    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void play() {
        System.out.println("Playing Guitar with Mark Knopfler");
    }
}
