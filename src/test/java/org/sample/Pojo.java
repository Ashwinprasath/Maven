package org.sample;

import org.libglobal.BaseClassForAdactin;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends BaseClassForAdactin{

	public Pojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement userText;
	
	@FindBys({@FindBy(id="password"),@FindBy(name="password")})
	private WebElement passText;

	public WebElement getUserText() {
		return userText;
	}

	public WebElement getPassText() {
		return passText;
	}
}
