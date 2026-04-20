package com.advanceUI;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	Thread.sleep(2000);
	driver.findElement(By.name("cusid")).sendKeys("123");
	Thread.sleep(2000);
	driver.findElement(By.name("submit")).click();
	
	Alert a1=driver.switchTo().alert();
	
	Thread.sleep(2000);
	System.out.println(a1.getText());
//	a1.dismiss();
	a1.accept();
	Alert a2=driver.switchTo().alert();
	Thread.sleep(2000);
	a2.accept();
}
}
