package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utility.Base;

public class RegistrationOfAmazon extends Base {
	
	@Test
	
	public void register() {
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//*[text()='Account & Lists']"));
		act.moveToElement(ele).perform();
		driver.findElement(By.xpath("//*[text()='Sign in']")).click();
		driver.findElement(By.xpath("//*[@id='createAccountSubmit']")).click();
		
	}

}
