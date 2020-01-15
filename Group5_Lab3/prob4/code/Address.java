package prob4;

public class Address {
	private String street;
	private String city;
	private String state;
	private String zip;
	
	public Address(String s, String c, String st, String z) {
		this.street = s;
		this.city = c;
		this.state = st;
		this.zip = z;
	}
	public Address(String c) {
		this.city = c;
	}
	
	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZip() {
		return zip;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	//public String getAddress() {
	@Override 
	public String toString(){
		String fullAddress = "";
		fullAddress += "Street: " + getStreet() + ", City: "+getCity() + ", State: "+getState() + ", Zip: " + getZip();
		return fullAddress;
	}
}
