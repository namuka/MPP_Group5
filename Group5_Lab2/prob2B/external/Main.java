package external;

import prob2B.Order;

public class Main {
	public static void main(String[] args) {
		Order o1 = new Order(1);
		o1.addOrderLine(1, 100, 5);
		o1.addOrderLine(2, 200, 10);
		System.out.println(o1);
		
		Order o2 = new Order(2);
		o2.addOrderLine(3, 300, 555);
		o2.addOrderLine(4, 400, 11);
		System.out.println(o2);
	}

}
