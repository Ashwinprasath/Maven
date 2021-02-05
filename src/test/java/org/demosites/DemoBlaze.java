package org.demosites;

import org.openqa.selenium.WebDriver;

public class DemoBlaze  {
	
	public static void main(String[] args) {

		WebDriver driver = null;
		DemoPom d= new DemoPom(driver);
		
		driver=LibGlobal.openBrowser();
		
		LibGlobal.getUrl("https://www.demoblaze.com/");
		
		LibGlobal.click(d.getLogIn());
		LibGlobal.implicitWait(3);
		
		LibGlobal.sendKeys(d.getUserName(), "Ashwin");
		LibGlobal.sendKeys(d.getPassword(), "Ashwin");
		LibGlobal.click(d.getBtnLogin());
		
		LibGlobal.click(d.getHomeBtn());
		LibGlobal.implicitWait(3);
		
		LibGlobal.click(d.getPhones());
		
//		click(d.);
	}
}
