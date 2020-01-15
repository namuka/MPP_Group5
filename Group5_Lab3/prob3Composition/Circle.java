package prob3Composition;


public class Circle {
	
	private double radius;
	public Circle(double radius) {
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public double computeArea() {
		return radius *radius * Math.PI;
	}
}
