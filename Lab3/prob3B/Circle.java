package lesson3.labs.prob3B;

public class Circle {
	private double radius;
	
	Circle(double r1){
		this.radius = r1;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double computeArea() {
		return Math.PI*radius*radius;
	}
}
