package prob2;

final public class Circle implements Figure {
	
	private double radius;
	
	public Circle(double r) {
		// TODO Auto-generated constructor stub
		radius=r;
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return Math.PI* radius * radius ;
	}

	public double getRadius() {
		return radius;
	}

}
