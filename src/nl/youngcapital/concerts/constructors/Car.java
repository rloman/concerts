package nl.youngcapital.concerts.constructors;

public class Car {

    private String licensePlate;

    public Car() {
        this.licensePlate = "<< onbekend >>";
    }

    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    // fails, want de computer weet dan niet welke je bedoelt
    /*
    public Car(String someOtherString) {

    }

     */

    public String getLicensePlate() {
        return licensePlate;
    }
}
