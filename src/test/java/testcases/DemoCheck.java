package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Base;
import utility.CustomDataProvider;
import utility.LoginPage;

public class DemoCheck extends Base{
	@Test(dataProvider = "loginDetails",dataProviderClass = CustomDataProvider.class,groups= {"tara"})
	public void validLogin(String uname, String pass) {
		
		LoginPage login = new LoginPage(driver);
		login.loginToApplication(uname, pass);
		System.out.println("Successfully done");
		
	}
	@Test(groups= {"tara"})
	public void printingA() {

		System.out.println("Printing is Successfully done for group tara");
		
		
	}
	@Test(groups= {"ananya"})
	public void printingB() {

		System.out.println("Printing is Successfully done for group ananya");
		
	}
	@Test(groups= {"Vinayak","Vidhiya"})
	public void printingC() {

		System.out.println("Printing is Successfully done for group Vinayak");
		
	}
	@Test(groups= {"Vidhiya"})
	public void printingD() {

		System.out.println("Printing is Successfully done for group Vidhiya");
		
	}
	}
