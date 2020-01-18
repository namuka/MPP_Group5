package prob2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figure[] figures= {new Triangle(10, 20),new Rectangle(3,4),new Circle(5)};
		
		double area=0;
		for (Figure figure : figures) {
			area+=figure.computeArea();
		}
		
		System.out.print("Sum of Areas: "+area);
	}

}
