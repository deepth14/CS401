package lesson3.labs.prob4;

public class House extends Shelter{
	private double rent;
	private double lotSize;
	
	House(double lSize){
		this.lotSize = lSize;
	}
	
	public double computeRent() {
		this.rent = 0.1*lotSize;
		return rent;
	}
}
