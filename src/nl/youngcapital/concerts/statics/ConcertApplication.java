package nl.youngcapital.concerts.statics;

import nl.youngcapital.concerts.model.Instrument;
import nl.youngcapital.concerts.model.Piano;
import nl.youngcapital.concerts.service.ConcertService;
import nl.youngcapital.concerts.utils.ConcertGebouw;
import nl.youngcapital.concerts.utils.Constants;

public class ConcertApplication {

    public static void main(String[] args) {

        ConcertService service = new ConcertService();

        Instrument[] instrumenten = service.geefAlleInstrumenten();

        ConcertGebouw.playAllInstruments(instrumenten);

        System.out.print("Aantal gemaakte instrumenten voor " + Constants.COMPANY_NAME);
        System.out.println(": " + Instrument.counter);

        // Intermezzo
        /* We hebben drie instrumenten verkocht voor 10.00 euro ex BTW / stuk
        en we willen de prijs weten voor die drie incl. btw
         */

        double totalPrice = Instrument.counter * 10 * Constants.BTW_PERCENTAGE;
        System.out.println(totalPrice);

        // dit kan maar mooi is anders
        Instrument i = new Piano();
        System.out.println(i.counter);


        // gebruik final in context met een locale variable
        final int age = 53;
//        age++; // vout



        // Exercise (gedaan)
        /*
        Maak playAllInstruments static
        Maak een label voor de bedrijfsnaam en print die af
         */

        // Exercise
        /*
            1). Maak een default constructor in Instrument
            2). Tel dmv die default constructor het aantal gemaakt Instrumenten
         */

    }
}