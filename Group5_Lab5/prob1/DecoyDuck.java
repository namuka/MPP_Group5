package prob1;

public class DecoyDuck extends Duck{

	public DecoyDuck() {
		setFly(new CannotFly());
		setQuack(new MuteQuack());
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("	displaying");
	}

}
