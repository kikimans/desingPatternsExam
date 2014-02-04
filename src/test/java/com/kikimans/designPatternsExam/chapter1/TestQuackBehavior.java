package com.kikimans.designPatternsExam.chapter1;

import org.junit.Test;

import com.kikimans.designPatternsExam.chapter1.impl.QuackBehavior;

public class TestQuackBehavior {
	
	private QuackBehavior behavior;

	@Test
	public void test_꽥꽥거리다() {
		behavior = new Quack();
		behavior.quack();
	}
	
	@Test
	public void test_삑삑거리다(){
		behavior = new Squeak();
		behavior.quack();
	}
	
	@Test 
	public void test_소리가나지않는다(){
		behavior = new MuteQuack();
		behavior.quack();
	}

}
