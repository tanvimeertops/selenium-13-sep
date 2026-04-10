package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicXpath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/selenium-xpath.html");
	Thread.sleep(2000);
	//tagname[@attr_name='attr_value']
	////tagname[@attr_name='attr_value']
	driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("123");
	Thread.sleep(2000);
	// //tagname [text()='text value' ]
String str= driver.findElement(By.xpath("//b[text()='Testing']")).getText();

System.out.println(str);
	
}
}
