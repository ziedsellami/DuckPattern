package tn.iit.duck;

import tn.iit.impl.FlyNoWay;
import tn.iit.impl.MuteQuack;

public class WoodenDuck extends Duck {

	public WoodenDuck() {
		this.setQuackBehavior(new MuteQuack());
		this.setFlyBehavior(new FlyNoWay());
	}
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
