package org.workouts;

import java.io.IOException;

import org.sample.Pojo;

public class Login extends Pojo {

	public static void main(String[] args) throws IOException {
		
		Pojo p= new Pojo();
		
		openBrowser();
		
		getUrl("http://adactinhotelapp.com/");
		
		sendKeys(p.getUserText(), getDataFromWorkbook(1, 0));
		sendKeys(p.getPassText(), getDataFromWorkbook(1, 1));
	}
}
