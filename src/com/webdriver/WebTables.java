package com.webdriver;

import java.security.Principal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///D:\\eclipse projects\\Selenium_13_sep\\src\\com\\webdriver\\index1.html");
	Thread.sleep(2000);
	for (int i = 2; i <=3; i++) {
		for (int j = 1; j <=4; j++) {
		String txt=	driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText();
			System.out.print(txt);
		}
		System.out.println();
	}
	

		
}
}
