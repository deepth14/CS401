package prob3;

public final class Triangle implements Shape {
	private final double base;
	private final double height;
	
	Triangle(double b, double h) {
		this.base = b;
		this.height = h;
	}
	
	public double getBase() {
		return base;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double computeArea() {
		return (1/2)*base*height;
	}
}
