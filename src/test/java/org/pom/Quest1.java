package org.pom;

import java.io.IOException;

public class Quest1 extends Facebook{
	
	public static void main(String[] args) throws IOException {
		
		openBrowser();
		
		getUrl("https://www.facebook.com/");
		
		Facebook f = new Facebook();
		
		sendKeys(f.getTextMail(), getDataFromWorkbook(1, 0));
		
		sendKeys(f.getTextPass(), getDataFromWorkbook(1, 6));
		
		f.getLoginBtn().click();
	}
	
}
