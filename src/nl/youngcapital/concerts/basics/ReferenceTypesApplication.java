package nl.youngcapital.concerts.basics;

import nl.youngcapital.concerts.model.*;

public class ReferenceTypesApplication {

    public static void main(String[] args) {

        Instrument instrument = new Piano();
        instrument.setName("Piano");

        Instrument anderInstrument = new Guitar();
        anderInstrument.setName("Guitar");

        Instrument nogEenAndere = new SmallAltSax();
        nogEenAndere.setName("Small alt Saxofoon");

        instrument.play();
        anderInstrument.play();
        System.out.println("Einde normale instrumenten");
        nogEenAndere.play();

        Piano p = new Piano();
        p.setName("Piano");
        p.setMerk("Yamaha");
        p.setAantalSnaren(6);

    }
}
