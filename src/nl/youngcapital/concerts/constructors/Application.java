package nl.youngcapital.concerts.constructors;

public class Application {

    public static void main(String[] args) {
        Car car = new Car("PS-12-GG");
        System.out.println(car.getLicensePlate());

        car = new Car();
        System.out.println(car.getLicensePlate());
    }
}
