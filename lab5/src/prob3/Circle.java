package prob3;

public final class Circle implements Shape {
	private final double radius;
	
	Circle(double r){
		this.radius = r;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double computeArea() {
		return Math.PI*radius*radius;
	}
}
