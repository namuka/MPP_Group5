package prob2;

final public class Triangle implements Figure {

	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		// TODO Auto-generated constructor stub
		this.base=base;
		this.height=height;
	}
	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		 return 1/2 * base * height;
	}
	public double getBase() {
		return base;
	}
	public double getHeight() {
		return height;
	}

}
