package prob1;

public class RubberDuck extends Duck {

	public RubberDuck() {
		// TODO Auto-generated constructor stub
		setFly(new CannotFly());
		setQuack(new Squeak());
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("	displaying");
	}

}
