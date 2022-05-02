package lesson3.labs.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
	private List<Apartment> apartment;
	private double maintenanceCost;
	
	Building(double aCost){
		this.maintenanceCost = aCost;
		apartment = new ArrayList<Apartment>();
	}
	
	public void addApartment(Apartment a1) {
		apartment.add(a1);
	}
	
	public double totalRent() {
		double totalRent = 0;
		for(Apartment a: apartment){
			totalRent += a.getRent();
		}
		return totalRent;
	}
	
	public double getProfit() {
		return totalRent() - maintenanceCost;
	}
}
