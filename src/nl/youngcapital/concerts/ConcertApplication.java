package nl.youngcapital.concerts;

import nl.youngcapital.concerts.model.Instrument;
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

        // Exercise
        /*
        Maak playAllInstruments static
        Maak een label voor de bedrijfsnaam en print die af
         */
    }
}