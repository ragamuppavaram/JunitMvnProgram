package com.junit.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class isFoundTest {

	@Test
	public void test() {
		Demo demo = new Demo();
		boolean output = demo.isFound("John");
		assertEquals(true, output);
	}

}
