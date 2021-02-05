package org.libglobal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClassForAdactin {

	public static WebDriver driver;

	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Achu\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void getUrl(String data) {
		driver.get(data);
		driver.manage().window().maximize();
	}

	public static void sendKeys(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void implicitWait(int i) {
		driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
	}

	public static void webDriverWait(int i, String id) {
		WebDriverWait wait = new WebDriverWait(driver, i);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
	}

	public static String getDataFromWorkbook(int row, int cell) throws IOException {

		File f = new File("C:\\Users\\Achu\\Maven\\Workbook\\Adacitin Hotel data.xlsx");

		FileInputStream fInput = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fInput);

		Sheet s = w.getSheet("Sheet1");

		Row r = s.getRow(row);

		Cell c = r.getCell(cell);

		int cellType = c.getCellType();

		String value;
		if (cellType == 1) {
			value = c.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(c)) {
			java.util.Date dateCellValue = c.getDateCellValue();
			SimpleDateFormat sd = new SimpleDateFormat("dd/MM/YYYY");
			value = sd.format(dateCellValue);
		} else {
			double ncv = c.getNumericCellValue();
			long l = (long) ncv;
			value = String.valueOf(l);
		}
		return value;
	}

	public static void selectByVisibleText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	public static String setCellValue(int row, int cell, String orderId) throws IOException {
		String value = null;
		File f = new File("C:\\Users\\Achu\\Maven\\Workbook\\Adacitin Hotel data.xlsx");

		FileInputStream fInput = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fInput);

		Sheet s = w.getSheet("Sheet1");

		Row r = s.getRow(row);

		Cell c = r.getCell(cell);

		c.setCellValue(orderId);

		FileOutputStream fOut = new FileOutputStream(f);
		w.write(fOut);

		return value;
	}
}
