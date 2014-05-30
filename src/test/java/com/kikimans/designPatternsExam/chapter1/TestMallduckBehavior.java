package com.kikimans.designPatternsExam.chapter1;

import org.junit.Before;
import org.junit.Test;

public class TestMallduckBehavior {
	
	

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test_mallarduck() {
		Duck duck = new MallarDuck();
		duck.display();
		duck.swim();
		
		duck.setFlyBehavior(new FlyWithWings());
		duck.setQuackBehavior(new Quack());
		duck.performFly();
		duck.performQuack();
		
		duck.setFlyBehavior(new FlyNoWay());
		duck.performFly();
		duck.setQuackBehavior(new MuteQuack());
		duck.performQuack();
		duck.display();
		
	}

}
