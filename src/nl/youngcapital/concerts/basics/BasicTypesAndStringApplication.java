package nl.youngcapital.concerts.basics;

public class BasicTypesAndStringApplication {

    public static void main(String[] args) {
        // integral types
        // byte = 8 bits;
        //  0          1010111 => 2^7 = 128 => byte loopt van:
        // -128 via 0 tot +127 = 256 mogelijkheden (want 2^8 = 256)
        byte b = 13;

        /*
        short = 16 bits
         */
        short s = 32767;

        // gebruik lekker altijd deze! :-)
        int myAge = 53; // min: -2 miljard,  max 2miljard

        // 64 bits.
        long bacterien = 8375483754835L; // L aan het eind anders denk Java dat het een int is en dan past het niet.
        System.out.println(8375483754835L);

        // breuken / floating points
        // 32 bits
        float f = 3.5F;
        System.out.println(3.5f);
        // 64 bits
        double d = 3.5; // gebruik lekker deze.

        // booleans
        boolean canFly = true;
        canFly = false;


        // char
        char initial = 'R'; // let op: start en begin met single quote en uiteraard altijd 1 char(acter)
        // char vout = 'DDDD';

        System.out.println(3+2);

        /*
            Maak een byte en vul die met je leeftijd
            Maak een andere (number) type
            Print ze afzonderlijk af
            Tel ze bij elkaar op en print ze

         */

        // Vreemde eend in de bijt
        // want geen constructor nodig voor maken String
        String firstName = "Franc";

    }
}
