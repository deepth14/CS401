package prob2;

public class RedheadDuck extends Duck {
	QuackBehaviour qb;
	FlyBehaviour fb;
	
	RedheadDuck(){
		this.fb = new FlyWithWings();
		this.qb = new Quack();
	}
	

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am Redhead Duck");
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
