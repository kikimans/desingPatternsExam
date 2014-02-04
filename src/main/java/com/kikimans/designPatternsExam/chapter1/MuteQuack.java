package com.kikimans.designPatternsExam.chapter1;

import com.kikimans.designPatternsExam.chapter1.impl.QuackBehavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("아무 소리도 나지 않는다. ");

	}

}
