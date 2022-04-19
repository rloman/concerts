package nl.youngcapital.concerts.interfaces.bezorging;

public class Application {

	public static void main(String[] args) {
		
		Bezorger bezorger = new Bezorger();
		bezorger.add(new PizzaRestaurant());
		
		bezorger.bezorgAlleRestaurants();
		
		// vout want een interface kun je niet met new instantieren
//		bezorger.add(new Restaurant());
	}

}
