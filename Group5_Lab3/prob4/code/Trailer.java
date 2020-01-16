package prob4;

public class Trailer extends Property{
	@Override
	public double computeRent() {
		return 500;
	}
	
	@Override
	public String toString() {
		String str = "";
		str += "City: " + super.getAddress().getCity() + ", Type: Trailer;" + "\n";
		return str;
	}
}
