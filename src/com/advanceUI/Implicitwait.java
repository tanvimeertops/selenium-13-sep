package com.advanceUI;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Implicitwait {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
	Thread.sleep(2000);
	driver.findElement(By.id("user-nam")).sendKeys("locked_out_user");
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	Thread.sleep(1000);
	driver.findElement(By.name("login-button")).click();
	Thread.sleep(5000);
	File file=((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
	Files.copy(file, new File("D:\\Selenium\\SS\\13-sep.png"));
	driver.close();
}
}
