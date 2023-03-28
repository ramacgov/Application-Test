package FirstScript;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGExample {
	
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "C:\\Users\\dell\\eclipse-workspace\\SeleniumTest\\Drivers\\geckodriver.exe";
    static WebDriver Driver;
    
    @Test
    public void verifyHomepageTitle() {
         
        System.out.println("launching Chrome browser"); 
        //System.setProperty("webdriver.gecko.driver", driverPath);
        WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		DesiredCapabilities cp = new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cp);
		Driver = new ChromeDriver(options);
		Driver.get(baseUrl);
		Reporter.log("URL Lanugers");
        String expectedTitle = "Welcome: Mercury Tours";
        Reporter.log("Expected");
        String actualTitle = Driver.getTitle();
        Reporter.log("Acutal");
        System.out.println("Expected "+expectedTitle);
        System.out.println("Actual "+actualTitle);
        Reporter.log("Expected Vs Actual Printed");
        //Assert.assertEquals(actualTitle, expectedTitle);
        //Driver.quit();
    }

}
