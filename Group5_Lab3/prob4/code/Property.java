package prob4;

public class Property {
	private double rent;
	private Address address;
	
	public Property() {
		address = new Address();
	}
	
	public double computeRent() {
		return rent;
	}
	
	public Address getAddress() {
		return address;
	}
	
	
}
