package org.pom;

import org.libglobal.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook extends LibGlobal{

	public Facebook() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement textMail;
	
	@FindBy(id="pass")
	private WebElement textPass;
	
	@FindBy(id="u_0_b")
	private WebElement loginBtn;

	public WebElement getTextMail() {
		return textMail;
	}

	public WebElement getTextPass() {
		return textPass;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
}
