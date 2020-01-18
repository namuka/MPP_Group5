package prob1;

public class RedheadDuck extends Duck {

	public RedheadDuck() {
		// TODO Auto-generated constructor stub
		setFly(new FlyWithWings());
		setQuack(new Quack());
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("	displaying");
		
	}

}
