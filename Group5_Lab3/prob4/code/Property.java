package prob4;

public class Property {
	private double rent;
	private Address address;
	
	public double computeRent() {
		return rent;
	}
	
	public void createAddress(String c) {
		this.address = new Address(c);
	}
	
	public void createAddress(String s, String c, String st, String z) {
		this.address = new Address(s, c, st, z);
	}
	
	public Address getAddress() {
		return address;
	}
	public String getCity() {
		return address.getCity();
	}
	
}
