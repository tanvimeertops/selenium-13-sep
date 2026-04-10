package com.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 
 */
public class FirstDemo {
public static void main(String[] args) throws InterruptedException {
	//to set browser
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	//to open empty browser
	WebDriver driver=new ChromeDriver();
	//to open a website
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(2000);
	System.out.println("current url:"+driver.getCurrentUrl());
	Thread.sleep(2000);
	System.out.println("title :"+driver.getTitle());
	
//	driver.close();//close a tab
	driver.quit(); //close a browser
}
}
