package prob4C;

public class Paycheck {
	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;
	
	Paycheck(double gross, double fica, double stateTax, double localTax, double medicare, double socialSecurity){
		this.grossPay = gross;
		this.fica = fica;
		this.state = stateTax;
		this.local = localTax;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
	}
	
	public void print() {
		System.out.println("Gross Pay: "+ grossPay +
				"\n" + "FICA Tax: " + fica*grossPay/100 +
				"\n" + "State Tax: " + state*grossPay/100 +
				"\n" + "Local Tax: " + local*grossPay/100 +
				"\n" + "Medicare: " + medicare*grossPay/100 +
				"\n" + "Social Security: " + socialSecurity*grossPay/100);
	}
	
	public double getNetPay() {
		double netPay;
		double tax;
		tax = fica*grossPay/100 + state*grossPay/100 + local*grossPay/100 + medicare*grossPay/100 + socialSecurity*grossPay/100;
		netPay = grossPay - tax;
		return netPay;
	}
}
