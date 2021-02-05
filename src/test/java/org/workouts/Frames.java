package org.workouts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Achu\\Cucumber\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	driver.manage().window().maximize();

	WebElement username = driver.findElement(By.xpath("//*[@name='fldLoginUserId']"));
	username.sendKeys("Hi");
}
}
