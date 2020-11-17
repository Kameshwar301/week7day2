package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;
import pages.LogInPage;

public class LoginWithInvalidData extends ProjectSpecification{

	
	@Test
	public void loginWithInvalidData() throws InterruptedException {
		
		new LogInPage(driver).enterUserName("demo123").enterPassword("crmsfa").clickForInvalidData().verifyErrorMessage();
		//new HomePage().clickCRMSFA().clickLeads().clickCreateLead().companyName().firtsName().lastName().createNewLead().leadIscreated();

	}
}
