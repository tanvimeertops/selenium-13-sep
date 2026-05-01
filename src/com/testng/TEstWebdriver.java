package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TEstWebdriver {
	WebDriver driver;
	@Test(priority = 0)
	public void before() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	public void enterUsername() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
		Thread.sleep(2000);
	}
	@Test(priority = 2)
	public void enterPassword() throws InterruptedException {
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
	}
	@Test(priority = 3)
	public void clickLogin() throws InterruptedException {
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(5000);
	}
	
	@Test(priority = 4)
	public void after() {
		driver.close();
	}
	
}
