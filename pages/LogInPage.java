package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecification;

public class LogInPage extends ProjectSpecification{
	
	public LogInPage(ChromeDriver driver) {
		this.driver=driver;//it is declare the global variable
		this.prop=prop;
		
	}
	public LogInPage enterUserName(String username) throws InterruptedException {
		driver.findElementById(prop.getProperty("LoginPage.Username.Id")).sendKeys(username);
		Thread.sleep(500);
		return this;
	}
	public LogInPage enterPassword(String password) {
		driver.findElementById(prop.getProperty("LoginPage.Password.Id")).sendKeys(password);
		return this;
	}
	public HomePage clickButton() {
		driver.findElementByClassName(prop.getProperty("LoginPage.Login.Classname")).click();
		return new HomePage(driver);
}
	
	public LogInPage clickForInvalidData() {
		driver.findElementByClassName("decorativeSubmit").click();
		return this;
}
	
	public void verifyErrorMessage() {
		System.out.println("Error message");

	}

}
