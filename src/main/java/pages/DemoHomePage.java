package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoHomePage {
 
	WebDriver driver;
	 
	public DemoHomePage(WebDriver driver){
		this.driver= driver;
		}
	By loginB = By.xpath("//button[@id='login']");
	
	public void clickLogin() {
		driver.findElement(loginB).click();
	}
}
