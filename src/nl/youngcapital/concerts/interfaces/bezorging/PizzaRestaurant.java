package nl.youngcapital.concerts.interfaces.bezorging;

public class PizzaRestaurant implements Restaurant {

	@Override
	public String getName() {
		return "Pizzeria De Gouden Knoflook";
	}

	@Override
	public int maximaalAantalBezoekers() {
		return 50;
	}

	@Override
	public String getAddress() {
		return "Kerkstraat 44";
	}

}
