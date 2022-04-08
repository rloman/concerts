package nl.youngcapital.concerts;

import nl.youngcapital.concerts.model.Instrument;
import nl.youngcapital.concerts.model.Piano;

public class Application {


    public static void main(String[] args) {

        // declaratie van een primitieve
        /*
        1: het type begint met een kleine letter: (int)
         */
        int age;
        double pi = 3.1415;

        // initialisatie
        age = 25;

        // declaratie+initialisatie mag in 1x
        int mijnHondHaarLeeftijd = 5;

        // herinitialisatie
        age = 50;

        // vout
//        int age = 28;

        Instrument instrument = new Instrument();
        instrument.setName("nl.youngcapital.concerts.model.Piano");

        Instrument anderInstrument = new Instrument();
        anderInstrument.setName("Drumstel");

        Instrument nogEenAndere = new Instrument();
        nogEenAndere.setName("Saxofoon");

        instrument.play();
        anderInstrument.play();
        nogEenAndere.play();

        Piano p = new Piano();
        p.setName("nl.youngcapital.concerts.model.Piano");
        p.setMerk("Yamaha");
        p.setAantalSnaren(6);

    }
}
