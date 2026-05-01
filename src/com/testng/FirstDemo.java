package com.testng;

import static org.testng.Assert.fail;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class FirstDemo {

	@Test
	public void test() {
		System.out.println("this test is passs");
	}
	
	@Test
	public void failTest() {
		System.out.println("This test is fail");
		fail();
	}
	
	@Test
	public void skipTest() {
		throw new SkipException("This test is skip");
	}
}
