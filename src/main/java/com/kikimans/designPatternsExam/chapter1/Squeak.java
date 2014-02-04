package com.kikimans.designPatternsExam.chapter1;

import com.kikimans.designPatternsExam.chapter1.impl.QuackBehavior;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("삑삑 거리다. ");
	}

}
