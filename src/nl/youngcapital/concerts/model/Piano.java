package nl.youngcapital.concerts.model;

// Je maakt een subclass door te extenden van zijn superclass, in dit geval nl.youngcapital.concerts.model.Instrument.
public class Piano extends Instrument {

    private int aantalSnaren;
    private String merk;

    public int getAantalSnaren() {
        return aantalSnaren;
    }

    public void setAantalSnaren(int aantalSnaren) {
        this.aantalSnaren = aantalSnaren;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
}
