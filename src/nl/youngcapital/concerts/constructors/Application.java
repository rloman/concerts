package nl.youngcapital.concerts.constructors;

public class Application {

    public static void main(String[] args) {

        // deze roep in class Car de Car(String licensePlate) constructor aan
        // let op: Car(String) dus. Een andere Car met argument String kan niet.
        // dan weet de computer niet welke hij moet aanroepen
        Car car = new Car("PS-12-GG");
        System.out.println(car.getLicensePlate());

        car = new Car();
        System.out.println(car.getLicensePlate());
    }
}
