package com.kikimans.designPatternsExam.chapter1;

import org.junit.Before;
import org.junit.Test;

import com.kikimans.designPatternsExam.chapter1.impl.FlyBehavior;

public class TestFlyBehavior {
	
	private FlyBehavior behavior;
	
	@Before
	public void setUp(){
		
	}

	@Test
	public void test_날다() {
		//날아간다.
		behavior = new FlyWithWings();
		behavior.fly();
	}
	
	@Test
	public void test_못날다(){
		behavior = new FlyNoWay();
		behavior.fly();
	}

}
