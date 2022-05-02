package prob4C;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hourly h1 = new Hourly(1, 14, 20);
		Commissioned c1 = new Commissioned(2, 400, 10);
		Salaried s1 = new Salaried(3, 1000);
		
		c1.addOrder(new Order(111, new Date() , 1000));
		c1.addOrder(new Order(112, new Date() , 1000));
		
		Object[] objects = {h1, c1, s1};
		
		for(Object O: objects) {
			System.out.println("Paycheck amount for Employee "+ ((Employee) O).getId() + " is: " + ((Employee) O).calcCompensation(4, 0).getNetPay());
		}
	}
}
