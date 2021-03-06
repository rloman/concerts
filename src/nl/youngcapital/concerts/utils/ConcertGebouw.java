package nl.youngcapital.concerts.utils;

import nl.youngcapital.concerts.model.Instrument;

// This is a utility class
public final class ConcertGebouw {

    public static void playAllInstruments(Instrument[] instrumenten) {

        for (Instrument instrument : instrumenten) {
            instrument.play();
        }
    }

    // prevent instantiation
    private ConcertGebouw() {

    }
}
