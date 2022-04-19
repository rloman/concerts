package nl.youngcapital.concerts.interfaces.bezorging;

import java.util.ArrayList;
import java.util.List;

public class Bezorger {
	
	private List<Restaurant> restaurants = new ArrayList<>();
	
	
	public void bezorgAlleRestaurants() {
		for(Restaurant restaurant: restaurants) {
			System.out.println("De bezorger is nu op restaurant '"+restaurant.getName()+"' op adres: '"+restaurant.getAddress()+"'");
		}
	}
	
	public void add(Restaurant restaurant) {
		this.restaurants.add(restaurant);
	}
}
