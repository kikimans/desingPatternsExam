package com.kikimans.designPatternsExam.chapter1;

import com.kikimans.designPatternsExam.chapter1.impl.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("No Fly! ");

	}

}
