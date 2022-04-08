package nl.youngcapital.concerts.interfaces;

public final class TelevisieTester {

    public static void testTvs(Televisie[] televisies) {
        for (Televisie televisie : televisies) {
            televisie.on();
            televisie.off();
        }
    }
}
