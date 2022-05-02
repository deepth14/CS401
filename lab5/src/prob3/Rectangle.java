package prob3;

public final class Rectangle implements Shape {
	private final double length;
	private final double breadth;
	
	Rectangle(double len, double bre) {
		this.length = len;
		this.breadth = bre;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getBreadth() {
		return breadth;
	}
	
	public double computeArea() {
		return length*breadth;
	}
}
