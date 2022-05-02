package lesson3.labs.prob4;

public class Condo extends Shelter{
	private double rent;
	private double numFloors;
	
	Condo(double nFloors){
		this.numFloors = nFloors;
	}
	
	public double computeRent() {
		this.rent = 400*numFloors;
		return rent;
	}
}
