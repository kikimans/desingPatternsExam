package com.kikimans.designPatternsExam.chapter1;

import com.kikimans.designPatternsExam.chapter1.impl.FlyBehavior;
import com.kikimans.designPatternsExam.chapter1.impl.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public abstract void display();
	
	public void swim(){
		System.out.println("all Duck swim");
	}

	public void performFly() {
		// TODO Auto-generated method stub
		flyBehavior.fly();
	}

	public void performQuack() {
		// TODO Auto-generated method stub
		quackBehavior.quack();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	
	
	
	
	

}
