package prob4C;

abstract public class Employee {
	private int empId;
	
	Employee(int id){
		this.empId = id;
	}
	
	public void print() {
		System.out.println("Employee Id is: " + empId);
	}
	
	public Paycheck calcCompensation(int month,int year) {
		return new Paycheck(calcGrossPay(month, year), 23, 5, 1, 3, 7.5);
	}
	
	public int getId() {
		return this.empId;
	}
	
	abstract public double calcGrossPay(int month, int year); 
}
