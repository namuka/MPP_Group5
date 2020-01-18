package prob1;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		// TODO Auto-generated constructor stub
		setFly(new FlyWithWings());
		setQuack(new Quack());
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("	display");
		
	}

}
