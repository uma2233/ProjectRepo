package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoLoginPage {
 
	WebDriver driver;
	 
	public DemoLoginPage(WebDriver driver){
		this.driver= driver;
		}
	By u = By.xpath("//input[@id='userName']");
	By p = By.xpath("//input[@id='password']");
	By l = By.xpath("//button[@id='login']");
	public void enterUser(String username) {
		driver.findElement(u).sendKeys(username);
		}
	
	public void enterPass(String pasword){
		driver.findElement(p).sendKeys(pasword);}
	
	
	public void performLogin(){
		driver.findElement(l).click();}
		
		
}
