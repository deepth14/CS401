package prob4C;

import java.util.Date;

@SuppressWarnings("unused")
public class Order {
	private int orderNo;
	private Date orderDate;
	private double orderAmount;
	
	Order(int orderNo, Date date, double amount){
		this.orderNo = orderNo;
		this.orderDate = date;
		this.orderAmount = amount;
	}
	
	public double getOrderAmount() {
		return orderAmount;
	}
}
