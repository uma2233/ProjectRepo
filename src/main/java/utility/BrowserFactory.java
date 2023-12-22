package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
WebDriver driver = null;
	
public static WebDriver browserfactory(String applicationUrl) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\singh\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(opt);
	driver.get(applicationUrl);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	return driver;
}
}
