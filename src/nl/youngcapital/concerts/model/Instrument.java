package nl.youngcapital.concerts.model;

public abstract class Instrument {

    // conventie is ongeveeer dit
    /*
    1) Eerst de statics
    2) Dan de private fields
    3) Dan de constructor(s)
    4) Dan de methodes (en de getters en setters)
     */
    public static int counter;

    // field (attribute, property)
    private String name;

    public Instrument() {
        counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void play();
}