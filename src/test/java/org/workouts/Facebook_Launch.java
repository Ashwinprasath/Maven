package org.workouts;

import java.io.IOException;
import org.libglobal.BaseClassForAdactin;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Launch extends BaseClassForAdactin {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Achu\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement userText = driver.findElement(By.id("email"));
		sendKeys(userText,getDataFromWorkbook(1, 0));
		
		WebElement passText = driver.findElement(By.id("pass"));
		sendKeys(passText, getDataFromWorkbook(1, 1)+Keys.ENTER);
	}
}
