package prob4C;

public class Salaried extends Employee {
	private double salary;
	
	Salaried(int id, double salary){
		super(id);
		this.salary = salary;
	}

	@Override
	public double calcGrossPay(int month, int year) {
		// TODO Auto-generated method stub
		return (year*12+month)*salary;
	}
}
