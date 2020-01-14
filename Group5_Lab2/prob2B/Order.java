package prob2B;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private int orderNum;
	private Date orderDate;
	private List<OrderLine> orderLines = new ArrayList<>();;
	public Order(int oNum) {
		orderNum = oNum;
		orderDate = new Date();
	}
	public void addOrderLine(int ln, double p, int q) {
		OrderLine orderLine = new OrderLine(this, ln, p, q);
		orderLines.add(orderLine); 
	}
	
	public int getOrderNum() {
		return orderNum;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public List<OrderLine> getOrderLines() {
		return orderLines;
	}
	
	@Override
	public String toString() {
		String str = "Order num: " + orderNum + "; Order date: " + orderDate + "\nOrderLines: \n";
		for(OrderLine o: orderLines) {
			str += "Line number: "+ o.getLinenum() + "; Price: "+ o.getPrice() + "; Quantity: "+o.getQuantity()+"\n";
		}
		return str;
	}

}
