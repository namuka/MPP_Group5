package prob4;

public class House extends Property {
	private double lotSize;
	
	public House(double ls) {
		this.lotSize = ls;
	}	
	
	@Override
	public double computeRent() {
		return 0.1*this.lotSize;
	}
	
	@Override
	public String toString() {
		String str = "";
		str += "City: " + super.getAddress().getCity() + ", Type: House; LotSize: " + lotSize + "\n";
		return str;
	}
}
