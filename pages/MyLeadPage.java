package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecification;

public class MyLeadPage extends ProjectSpecification{
	
	public MyLeadPage(ChromeDriver driver) {
		this.driver=driver;//it is declare the global variable
		
	}
	
	public CreateLeadPage clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage(driver);
	}

}
