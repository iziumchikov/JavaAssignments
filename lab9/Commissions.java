/*

 * Description:Commissions class extends Hourly class. Creates 
 * commissions for current employee.
 * Lab# 9.1
*/

public class Commissions extends Hourly{
	
	private double totalSales;	//to hold total sales of employee
	private double commissionRate;	//to hold commission rate of employee

	//Constructor: Receives name, address, phone,
	//social security number, rate and commission
	//rate of employee. Calls constructor of parent 
	//class and sets the commission rate.
	public Commissions(String eName, String eAddress, String ePhone, String socSecNumber,
						double rate,double commissionRate) 
	{
		super(eName, eAddress, ePhone, socSecNumber, rate);
		this.commissionRate = commissionRate;
	}

	// Method addSales receives totalSales for one 
	//employee and sets this amount to totalSales 
	//variable.
	public void addSales(double totalSales)
	{
		this.totalSales += totalSales;
	}

	//Computes and returns the pay for hours worked
	//plus commission of total sales.-
	public double pay()
	{
		double payment = super.pay() + (totalSales * commissionRate);
		totalSales = 0;
		return payment;
	}

	//Returns a string with all info of employee.
	public String toString()
	{
		String result = super.toString();
		result += "\nTotal sales: " + totalSales;
		return result;
	}

	public double getTotalSales()
	{
		return totalSales;
	}

	public void setTotalSales(double num)
	{
		totalSales = num;
	}

	public double getCommissionRate()
	{
		return commissionRate;
	}

	public void setCommissionRate(double num)
	{
		this.commissionRate = num;
	}
}
