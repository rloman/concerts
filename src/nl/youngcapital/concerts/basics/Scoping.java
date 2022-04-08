package nl.youngcapital.concerts.basics;

public class Scoping {

    // variable die ik hier maak zijn ook bekend in de blokken hieronder
    public static void main(String[] args) {

        // variable die ik hier maak zijn ook bekend in de blokken hieronder

        int myAgeOK = 50;


        // variablen die ik hier maak zijn aan het einde van hun leven bij de eerste sluitende accolade

        {

            int myAgeBad = 15;

            // is myAgeOK hier bekend?
            System.out.println(myAgeOK);

        }

        // isMyageOk hier nog benaderbaar

        // klopt,
        System.out.println(myAgeOK);

        // Nee, klopt, myAgeBad is hier off-scope
    }

}
