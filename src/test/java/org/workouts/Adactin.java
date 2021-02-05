package org.workouts;


import java.io.IOException;
import org.libglobal.BaseClassForAdactin;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Adactin extends BaseClassForAdactin{

	public static void main(String[] args) throws IOException, InterruptedException {
		openBrowser();
		
		getUrl("http://adactinhotelapp.com/index.php");
		Thread.sleep(5000);
		
		WebElement userText = driver.findElement(By.id("username"));
		sendKeys(userText, getDataFromWorkbook(1, 0));
		
		WebElement passText = driver.findElement(By.id("password"));
		sendKeys(passText, getDataFromWorkbook(1, 1)+Keys.ENTER);
		
		WebElement element = driver.findElement(By.id("location"));
		selectByVisibleText(element, "Sydney");
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		selectByVisibleText(hotel, "Hotel Sunshine");
		
		WebElement roomType = driver.findElement(By.id("room_type"));
		selectByVisibleText(roomType, "Standard");
		
		WebElement noOfRooms = driver.findElement(By.id("room_nos"));
		selectByVisibleText(noOfRooms, "2 - Two");
		
		WebElement checkIn = driver.findElement(By.id("datepick_in"));
		checkIn.clear();
		sendKeys(checkIn, getDataFromWorkbook(1, 2));
		
		WebElement checkOut = driver.findElement(By.id("datepick_out"));
		checkOut.clear();
		sendKeys(checkOut, getDataFromWorkbook(1, 3));
		
		driver.findElement(By.id("Submit")).click();
		
		driver.findElement(By.id("radiobutton_0")).click();
		
		driver.findElement(By.id("continue")).click();
		
		WebElement firstName = driver.findElement(By.id("first_name"));
		sendKeys(firstName, getDataFromWorkbook(1, 4));
		
		WebElement lastName = driver.findElement(By.id("last_name"));
		sendKeys(lastName, getDataFromWorkbook(1, 5));
		
		WebElement address = driver.findElement(By.id("address"));
		sendKeys(address, getDataFromWorkbook(1, 6));
		
		WebElement cardNo = driver.findElement(By.id("cc_num"));
		sendKeys(cardNo, getDataFromWorkbook(1, 7));
		
		WebElement cardType = driver.findElement(By.id("cc_type"));
		selectByVisibleText(cardType, "VISA");
		
		WebElement expiryMonth = driver.findElement(By.id("cc_exp_month"));
		selectByVisibleText(expiryMonth, "March");
		
		WebElement expYear = driver.findElement(By.id("cc_exp_year"));
		selectByVisibleText(expYear, "2022");
		
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		sendKeys(cvv, getDataFromWorkbook(1, 10));
		
		driver.findElement(By.id("book_now")).click();
		
		implicitWait(5);
		
		WebElement OrderId = driver.findElement(By.id("order_no"));
		String text = OrderId.getAttribute("value");
		System.out.println(text);
		
		setCellValue(1, 11, text);
	}
}
