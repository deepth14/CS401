package prob2;

public class DecoyDuck extends Duck{
	QuackBehaviour qb;
	FlyBehaviour fb;
	DecoyDuck(){
		this.fb = new CannotFly();
		this.qb = new MuteQuack();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am Decoy Duck");
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
