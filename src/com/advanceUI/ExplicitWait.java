package com.advanceUI;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20000));
	driver.findElement(By.xpath("//*[@id=\"post-body-7708391096228750161\"]/button")).click();
	String ele= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']"))).getText();
	System.out.println(ele);
}
}
