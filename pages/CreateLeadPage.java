package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecification;

public class CreateLeadPage extends ProjectSpecification{
	
	public CreateLeadPage(ChromeDriver driver) {
		this.driver=driver;//it is declare the global variable
		
	}
	public CreateLeadPage companyName() {
		driver.findElementById("createLeadForm_companyName").sendKeys("MNW IT India Pvt Ltd");
		return this;
	}
	public CreateLeadPage firtsName() {
		driver.findElementById("createLeadForm_firstName").sendKeys("Kameshwar");
		return this;
	}
	public CreateLeadPage lastName() {
		driver.findElementById("createLeadForm_lastName").sendKeys("Subramanian");
		return this;

	}
	public ViewLeadPage createNewLead() {
		driver.findElementByClassName("smallSubmit").click();
		return new ViewLeadPage();
	}
 
}
