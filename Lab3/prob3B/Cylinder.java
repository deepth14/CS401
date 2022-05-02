package lesson3.labs.prob3B;

public class Cylinder {
	private Circle base;
	private double height;
	
	Cylinder(double radius, double height){
		base = new Circle(radius);
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getVolume() {
		return base.computeArea()*height;
	}
}
