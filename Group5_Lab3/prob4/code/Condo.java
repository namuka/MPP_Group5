package prob4;

public class Condo extends Property{
	private int numFloors;
	
	public Condo(int nf) {
		this.numFloors = nf; 
	}
	
	@Override
	public double computeRent() {
		return 400*this.numFloors;
	}
	
	@Override
	public String toString() {
		String str = "";
		str += "City: " + super.getAddress().getCity() + ", Type: Condo; NumFloors: " + numFloors + "\n";
		return str;
	}
}
