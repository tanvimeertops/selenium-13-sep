package com.fw;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class KeywordDriven {
	@DataProvider(name = "tanvi")
	public Object[][] readData() throws InvalidFormatException, IOException {
		Object[][] data = null;
		// 1. to get a filepath
		String filepath = "D:\\Selenium\\excel\\13-sep.xlsx";
		// 2. to make file
		File file = new File(filepath);
		// 3. to open excel workbook
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		// 4. to open a particular sheet
		Sheet sheet = workbook.getSheet("Sheet2");
		// 5. to find number of row
		int nrow = sheet.getPhysicalNumberOfRows();
		System.out.println("no of row :" + nrow);

		data = new Object[nrow][];

		for (int i = 0; i < data.length; i++) {
			// 6. to select a entire row
			Row row = sheet.getRow(i);
			int ncol = row.getPhysicalNumberOfCells();
			System.out.println("col is :" + ncol);
			data[i] = new Object[ncol];
			for (int j = 0; j < data[i].length; j++) {
				// 7. to get number of cell in each row
				Cell cell = row.getCell(j);
				// 9. to convert into string
				cell.setCellType(CellType.STRING);
				// 10. to get data from cell
				data[i][j] = cell.getStringCellValue();
			}
		}

		return data;
	}

	WebDriver driver;

	@Test(dataProvider = "tanvi")
	public void test(String keyword) throws InterruptedException, InvalidFormatException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");

//		 String[][] data=readData();
//		for (int i = 0; i < data.length; i++) {
		if (keyword.equalsIgnoreCase("open browser")) {
			driver = new ChromeDriver();
		} else if (keyword.equalsIgnoreCase("enter url")) {
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(2000);
		} else if (keyword.equalsIgnoreCase("enter username")) {
			driver.findElement(By.id("user-nam")).sendKeys("standard_user");
			Thread.sleep(2000);
		} else if (keyword.equalsIgnoreCase("enter password")) {
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			Thread.sleep(1000);
		} else if (keyword.equalsIgnoreCase("click login")) {
			driver.findElement(By.name("login-button")).click();
			Thread.sleep(2000);
		} else if (keyword.equalsIgnoreCase("close browser")) {

			driver.close();
		}
	}
}
