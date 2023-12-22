package testcases;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import utility.Base;

public class NewWinCheck extends Base {
	
	@Test
	public void test1() throws InterruptedException {
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(1000);
		driver.get("https://www.javatpoint.com/inheritance-in-java");
	}

}
