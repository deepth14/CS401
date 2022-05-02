package lesson3.labs.prob4;

public class Address {
	private String street;
	private String city;
	private String state;
	private int zip;
	
	Address(String s, String c, String st, int z){
		this.street = s;
		this.city = c;
		this.state =st;
		this.zip = z;
	}
	
	public String toString() {
		return street + ", " +city + ", " + state + "-" + zip; 
	}
}
