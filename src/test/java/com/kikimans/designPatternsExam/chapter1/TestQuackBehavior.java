package com.kikimans.designPatternsExam.chapter1;

import static org.junit.Assert.*;

import org.junit.Test;

import com.kikimans.designPatternsExam.chapter1.impl.QuackBehavior;

public class TestQuackBehavior {
	
	private QuackBehavior behavior;

	@Test
	public void test_꽥꽥거리다() {
		behavior = new Quack();
		behavior.quack();
	}

}
