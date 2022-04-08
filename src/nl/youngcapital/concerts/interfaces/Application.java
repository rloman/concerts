package nl.youngcapital.concerts.interfaces;

public class Application {

    public static void main(String[] args) {

        Televisie samsungTV = new SamsungTV();
        Televisie sonyTV = new SonyTV();
        Televisie[] televisies = {samsungTV, sonyTV};
        TelevisieTester.testTvs(televisies);
    }
}