package FirstScript;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction;




public class Firstseleniumscript {
	static WebDriver Driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\eclipse-workspace\\SeleniumTest\\Drivers\\geckodriver.exe");
		//System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		DesiredCapabilities cp = new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cp);
		
		//System.setProperty("webdriver.http.factory", "jdk-http-client");
		Driver = new ChromeDriver(options);
		Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Driver.get("http://demo.guru99.com/test/newtours/");
		//Driver.close();

	}

	private static void DesiredCapabilities() {
		// TODO Auto-generated method stub
		
	}

}
