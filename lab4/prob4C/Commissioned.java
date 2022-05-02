package prob4C;

import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {
	private double commission;
	private double baseSalary;
	private List<Order> orders;
	
	Commissioned(int id, double salary, double commission){
		super(id);
		this.baseSalary = salary;
		this.commission = commission;
		this.orders = new ArrayList<Order>();
	}
	
	@Override
	public double calcGrossPay(int month, int year) {
		// TODO Auto-generated method stub
		
		return (year*12+month)*baseSalary + getCommission();
	}
	
	public void addOrder(Order o) {
		this.orders.add(o);
	}
	
	public double getCommission() {
		double netOrder = 0;
		for(Order o: orders) {
			netOrder += o.getOrderAmount();
		}
		
		return netOrder*commission;
	}
}
