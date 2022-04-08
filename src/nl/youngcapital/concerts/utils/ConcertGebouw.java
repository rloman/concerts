package nl.youngcapital.concerts.utils;

import nl.youngcapital.concerts.model.Instrument;

public class ConcertGebouw {

    public static void playAllInstruments(Instrument[] instrumenten) {

        for (Instrument instrument : instrumenten) {
            instrument.play();
        }
    }
}
