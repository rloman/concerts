package nl.youngcapital.concerts.service;

import nl.youngcapital.concerts.model.Guitar;
import nl.youngcapital.concerts.model.Instrument;
import nl.youngcapital.concerts.model.Piano;
import nl.youngcapital.concerts.model.SmallAltSax;

public class ConcertService {

    public Instrument[] geefAlleInstrumenten() {

        Instrument instrument = new Piano();
        Instrument.counter++;
        Instrument anderInstrument = new Guitar();
        Instrument.counter++;
        Instrument nogEenAndere = new SmallAltSax();
        Instrument.counter++;

        Instrument[] instrumenten = {instrument, anderInstrument, nogEenAndere};

        return instrumenten;
    }
}
