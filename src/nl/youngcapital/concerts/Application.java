package nl.youngcapital.concerts;

import nl.youngcapital.concerts.model.*;

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
