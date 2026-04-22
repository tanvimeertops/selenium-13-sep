package com.advanceUI;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ele_POP_UP {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/popup.php");
	Thread.sleep(2000);
	String main_w= driver.getWindowHandle();
	System.out.println(main_w);
	
	driver.findElement(By.partialLinkText("Here")).click();
	Set<String> all_w=driver.getWindowHandles();
	System.out.println("all"+all_w);
	Iterator<String> i1=all_w.iterator();
	while (i1.hasNext()) {
		String child_w = i1.next();
		if(!main_w.equals(child_w)) {
			driver.switchTo().window(child_w);
			driver.findElement(By.name("emailid")).sendKeys("123");
			Thread.sleep(2000);
			driver.close();
		}
	}
	Thread.sleep(3000);
	driver.switchTo().window(main_w);
	driver.close();
}
}
