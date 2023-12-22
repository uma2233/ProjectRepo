package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoDashboardPage {

	WebDriver driver;
	 
	public DemoDashboardPage(WebDriver driver){
		this.driver= driver;
		}
	By heading = By.xpath("//div[@class='main-header']");
	By logout = By.xpath("//button[@id='submit']");
	
	public String captureHeading() {
		
		String txt = driver.findElement(heading).getText();
		return txt;
		
	}
public void clickLogout() {
		
	driver.findElement(logout).click();
		
		
	}
}
