package prob4;

public class CustOrderFactory {
	
	private CustOrderFactory() {}
	
	public static Customer createCustomer(String name) {
		Customer cust=null;
		if(name!=null) {
			cust=new Customer(name);
		}
		return cust;
	}
}
