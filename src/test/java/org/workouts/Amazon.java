package org.workouts;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.libglobal.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Amazon extends LibGlobal{

	public static void main(String[] args) {
		
		openBrowser();
		
		getUrl("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dell inspiron" + Keys.ENTER);

		List<String> l = new LinkedList<String>();
		List<WebElement> products = driver
				.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		System.out.println("Total products in this page=" +products.size());
		for (WebElement x : products) {
			String a = x.getText();
			System.out.println(a);
			String data = a.substring(0, 18);
			String last = data.toUpperCase();
			l.add(last);
		}
		Set<String> s = new LinkedHashSet<String>();
		s.addAll(l);
		System.out.println("After removing the duplicates=" +s.size());
		System.out.println(s);
		
		//Filter the price list
		List<WebElement> priceList = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		for (WebElement y : priceList) {
			String price= y.getText();
			String replace = price.replace(',', '.');
			int i= Integer.parseInt(replace);
			double d= (double) i;
			if (d>40.000) {
				System.out.println(d);
			}
		}
	}
}
