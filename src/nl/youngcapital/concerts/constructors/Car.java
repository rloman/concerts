package nl.youngcapital.concerts.constructors;

public class Car {

    private String licensePlate;

    public Car() {
        this.licensePlate = "<< onbekend >>";
    }

    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
}
