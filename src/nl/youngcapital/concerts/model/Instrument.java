package nl.youngcapital.concerts.model;

public class Instrument {

    // field (attribute, property)
    private String name;

    // instance method
    public void play() {
        System.out.println("Playing instrument with name: " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}