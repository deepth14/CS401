package prob4.extpackage;

import prob4.CustOrderFactory;
import prob4.Customer;

public class Main {
	public static void main(String[] args) {
		Customer cust = CustOrderFactory.createCustomerAndOrder("Bob");
		System.out.println(cust.getOrders());
	}
}

		
