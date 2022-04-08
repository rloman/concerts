package nl.youngcapital.concerts.model;

// You cannot extend from a final class
public /*final*/ class Saxophone extends Instrument {

    @Override// a final method cannot be overridden
    public /*final*/ void play() {
        System.out.println("Playing Saxophone with Candy Dulfer");
    }
}
