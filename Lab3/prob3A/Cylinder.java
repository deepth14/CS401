package lesson3.labs.prob3A;

public class Cylinder extends Circle{
	private double height;
	
	Cylinder(double radius, double height){
		super(radius);
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double computeVolume() {
		return computeArea()*height;
	}
}
