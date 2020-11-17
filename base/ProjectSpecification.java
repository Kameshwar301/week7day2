package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcelData;

public class ProjectSpecification {

	public ChromeDriver driver;
	public String excedlFileName;
	public static Properties prop;

	@BeforeMethod
	public void preCondition() throws IOException {
		FileInputStream fis = new FileInputStream("./src/main/resources/English.properties");
		Properties prop = new Properties();

		// to load the properties file for interaction
		prop.load(fis);

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

	@DataProvider(name = "fetcha")
	public String[][] sendData() throws IOException {
		ReadExcelData red = new utils.ReadExcelData();
		String[][] data = red.readExcel(excedlFileName);
		return data;
	}
}
