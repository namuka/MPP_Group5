package prob2;

final public class Rectangle implements Figure {
	
	private final double width;
	private final double height;
	
	public Rectangle(double w, double h) {
		// TODO Auto-generated constructor stub
		width=w;
		height=h;
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return width * height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

}
