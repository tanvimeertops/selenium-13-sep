package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Css selector :
 * id : tagname#id
 * class 
 * attr
 */
public class LOcCSSID {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input#_R_64qjbjb9pb6amH1_")).sendKeys("t@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input#_R_66qjbjb9pb6amH1_")).sendKeys("123");
}
}
