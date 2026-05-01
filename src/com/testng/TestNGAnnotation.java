package com.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation {
	@BeforeTest
	public void beforeTest() {
		System.out.println("this will run before teest");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
	}

	@Test
	public void test1() {
		System.out.println("This is test 1");
	}
	@Test
	public void test2() {
		System.out.println("This is test 2");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("after test");
	}
}
