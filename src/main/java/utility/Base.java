package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {
	public WebDriver driver;
	@BeforeClass
	public void startB() {
		driver = BrowserFactory.browserfactory("https://demoqa.com/books");
		
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
