package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EleMultiselect {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://output.jsbin.com/osebed/2");
	Thread.sleep(2000);
	WebElement element=driver.findElement(By.id("fruits"));
	Select s1=new Select(element);
	s1.selectByIndex(0);
	Thread.sleep(2000);
	s1.selectByValue("orange");
	Thread.sleep(2000);
	s1.selectByVisibleText("Apple");
	Thread.sleep(2000);
	s1.deselectByIndex(0);
}
}
