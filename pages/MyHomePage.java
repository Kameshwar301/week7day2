package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecification;

public class MyHomePage extends ProjectSpecification{
	
	public MyHomePage(ChromeDriver driver) {
		this.driver=driver;//it is declare the global variable
		
	}
	
	public MyLeadPage clickLeads() {
		driver.findElementByXPath("//a[@href='/crmsfa/control/leadsMain']").click();
		return new MyLeadPage(driver);
	}

}
