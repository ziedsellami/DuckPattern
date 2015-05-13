package tn.iit.duck;

import tn.iit.impl.FlyWithWings;
import tn.iit.impl.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		this.setQuackBehavior(new Quack());
		this.setFlyBehavior(new FlyWithWings());
	}

	public void display() {
		System.out.println("I'am a Mallard Duck");

	}

}
