package nl.youngcapital.concerts.interfaces.bezorging;

public class Application {

	public static void main(String[] args) {
		
		Bezorger bezorger = new Bezorger();
		bezorger.add(new PizzaRestaurant());
		
		bezorger.bezorgAlleRestaurants();
		
		// vout
//		bezorger.add(new Restaurant());
		
		

	}

}
