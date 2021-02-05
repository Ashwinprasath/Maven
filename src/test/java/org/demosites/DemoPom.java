package org.demosites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoPom {


	public DemoPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login2")
	private WebElement logIn;
	
	@FindBy(id="loginusername")
	private WebElement userName;
	
	@FindBy(id="loginpassword")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement btnLogin;
	
	@FindBy(xpath="(//a[@class='nav-link'])[1]")
	private WebElement homeBtn;
	
	@FindBy(xpath="(//a[@id='itemc'])[1]")
	private WebElement phones ;

	public WebElement getLogIn() {
		logIn.click();
		return logIn;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getHomeBtn() {
		return homeBtn;
	}

	public WebElement getPhones() {
		return phones;
	}
}
