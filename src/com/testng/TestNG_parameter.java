package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_parameter {

	  @Test
		@Parameters({"username","password"})
		public void f(String uname, String pass) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(2000);
			driver.findElement(By.id("user-name")).sendKeys(uname);
			Thread.sleep(2000);
			driver.findElement(By.id("password")).sendKeys(pass);
			Thread.sleep(1000);
			driver.findElement(By.name("login-button")).click();
			Thread.sleep(5000);
			driver.close();
		
	  
  }
}
