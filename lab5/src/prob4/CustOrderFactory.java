package prob4;

import java.time.LocalDate;

final public class CustOrderFactory {
	private CustOrderFactory() {}
	
	public static Customer createCustomerAndOrder(String name) {
		Customer cust = new Customer(name);
		Order order = Order.newOrder(cust, LocalDate.now());
		order.addItem("Shirt");
		order.addItem("Laptop");

		order = Order.newOrder(cust, LocalDate.now());
		order.addItem("Pants");
		order.addItem("Knife set");
		
		return cust;
	} 
}
