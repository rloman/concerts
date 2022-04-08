package nl.youngcapital.concerts.model;

public abstract class Instrument {

    public static int counter;

    // field (attribute, property)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void play();
}