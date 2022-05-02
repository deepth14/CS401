package lesson3.labs.prob4;

abstract public class Shelter {
	private Address address;

	abstract public double computeRent();

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
