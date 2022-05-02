package prob3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] t = { new Triangle(3, 10), new Rectangle(5, 5), new Circle(7)};
		
		double totalArea = 0;
		for(Shape s: t) {
			totalArea += s.computeArea();
		}
		
		System.out.println(totalArea);
	}

}
