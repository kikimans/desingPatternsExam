package com.kikimans.designPatternsExam.chapter1;

import com.kikimans.designPatternsExam.chapter1.impl.QuackBehavior;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("꿱꿱 거리다 ");
	}

}
