package com.testng;

import org.testng.annotations.Test;

public class TestNG_group {
  @Test(groups = "red")
  public void red1() {
	  System.out.println("This red group");
  }
  @Test(groups = "red")
  public void red2() {
	  System.out.println("This red group");
  }
  @Test(groups = "red")
  public void red3() {
	  System.out.println("This red group");
  }
  @Test(groups = "green")
  public void green1() {
	  System.out.println("This green group");
  }
  @Test(groups = "green")
  public void green2() {
	  System.out.println("This green group");
  }
  @Test(groups = "green")
  public void green3() {
	  System.out.println("This green group");
  }
}
