package prob1;

abstract public class Duck{
	
	FlyBehavior fb;
	QuackBehavior qb;
	
	public void swim() {
		System.out.println("	swimming");
	}
	
	abstract public void display();

	public void fly() {
		 fb.fly();
	}

	public void quack() {
		 qb.quak();
	}
	
	public void setFly(FlyBehavior fb) {
		this.fb=fb;
	}
	
	public void setQuack(QuackBehavior qb) {
		this.qb=qb;
	}
	
}
