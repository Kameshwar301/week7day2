package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecification;

public class HomePage extends ProjectSpecification{
	
	public HomePage(ChromeDriver driver) {
		this.driver=driver;//it is declare the global variable
		
	}
	
	public MyHomePage clickCRMSFA() {
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage(driver);
	}

}
