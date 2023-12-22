package testcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.DemoDashboardPage;
import pages.DemoHomePage;
import pages.DemoLoginPage;
import utility.Base;
import utility.CustomDataProvider;

public class DemoSiteLoginFunctionality extends Base {
	
	@Test(dataProvider = "loginDetails",dataProviderClass = CustomDataProvider.class)
	public void demoSiteTestingWithPOM(String username, String pasword) {
		DemoHomePage dm = new DemoHomePage(driver);
		DemoLoginPage lp = new DemoLoginPage(driver);
		DemoDashboardPage dp = new DemoDashboardPage(driver);
		
		dm.clickLogin();
		
		lp.enterUser(username);
		lp.enterPass(pasword);
		lp.performLogin();
		System.out.println(dp.captureHeading());
		
		String succurl = driver.getCurrentUrl();
		System.out.println(succurl);
		dp.clickLogout();
		SoftAssert sf = new ();
		
		
		
		
		
		
	}
	


}
