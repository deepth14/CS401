package prob4C;

public class Hourly extends Employee{
	private double hourlyWage;
	private int hoursPerWeek;
	
	Hourly(int id, double wage, int hours){
		super(id);
		this.hourlyWage = wage;
		this.hoursPerWeek = hours;
	}
	
	@Override
	public double calcGrossPay(int month, int year) {
		// TODO Auto-generated method stub
		int totalHoursWorked = (month + year*12)*4*hoursPerWeek;
		
		return totalHoursWorked*hourlyWage;
	}
}
