package tn.iit.duck;

import tn.iit.behavior.FlyBehavior;
import tn.iit.behavior.QuackBehavior;

public abstract class Duck {
	protected QuackBehavior quackBehavior;
	protected FlyBehavior flyBehavior;
  //comm b     fdbcvbcvb    /// efv 
	public void performQuack() {
		quackBehavior.quack();
	}
	public void swim(){
		System.out.println("je nage");
	}
	public abstract void display();
	
	public void performfly(){
		flyBehavior.fly();
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

}
