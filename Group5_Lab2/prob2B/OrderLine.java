package prob2B;

public class OrderLine {
	private int linenum;
	private double price;
	private int quantity;
	private Order order;
	
	 OrderLine(Order o, int ln, double p, int q) {
		order = o;
		linenum = ln;
		price = p;
		quantity = q;
	}
	public int getLinenum() {
		return linenum;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public Order getOrder() {
		return order;
	}
	
}
