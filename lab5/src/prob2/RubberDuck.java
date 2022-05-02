package prob2;

public class RubberDuck extends Duck {
	QuackBehaviour qb;
	FlyBehaviour fb;
	
	RubberDuck(){
		this.fb = new CannotFly();
		this.qb = new Squeak();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am Rubber Duck");
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		this.qb.quack();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		this.fb.fly();
	}

}
