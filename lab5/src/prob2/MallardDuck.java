package prob2;

public class MallardDuck extends Duck {
	QuackBehaviour qb;
	FlyBehaviour fb;
	
	MallardDuck(){
		this.fb = new FlyWithWings();
		this.qb = new Quack();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println( "I am Mallard Duck");
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
