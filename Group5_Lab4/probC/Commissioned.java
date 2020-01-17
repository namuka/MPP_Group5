package probC;

import java.util.List;

public class Commissioned extends Employee{
	
	private double commission;
	private double baseSalary;
	private List<Order> orders;

	public Commissioned(String eId, double c, double bs, List<Order> oList) {
		super(eId);
		this.commission = c;
		this.baseSalary = bs;
		this.orders = oList;
	}

	@Override
	public double calcGrossPay(int m, int y) {
		// TODO Auto-generated method stub
		double result = baseSalary;
		double totalOrderAmount = 0.0;
	
		for(Order o :orders) {			
			if((m - 1) ==o.getOrderDate().getMonthValue() && y==o.getOrderDate().getYear()) {			
				totalOrderAmount += o.getOrderAmount();
			}
		}
		
		result += totalOrderAmount*commission;
		return result;
	}
	
}
