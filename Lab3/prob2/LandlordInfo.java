package lesson3.labs.prob2;

import java.util.ArrayList;
import java.util.List;

public class LandlordInfo {
	private List<Building> buildings;
	
	LandlordInfo() {
		buildings = new ArrayList<Building>();
	}
	
	public void addBuilding(Building b1) {
		buildings.add(b1);
	}
	
	public double calcProfits() {
		double profit = 0;
		for(Building b: buildings) {
			profit += b.getProfit();
		}
		
		return profit;
	}
}
