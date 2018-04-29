package framework;

import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;

public class DriverFactory {

	
	 public static WebDriver createInstance(String browserName) {
	        WebDriver driver = null;
	        if (browserName.toLowerCase().contains("firefox")) {
	        	System.out.println("Running Firefox ############"+ConfigurationManager.getBundle().getString("webdriver.gecko.driver"));
	        	System.setProperty("webdriver.gecko.driver", ConfigurationManager.getBundle().getString("webdriver.gecko.driver"));
	        	FirefoxOptions options = new FirefoxOptions();
	        	
	        	options.setBinary(ConfigurationManager.getBundle().getString("firefoxbinarypath"));
	            driver = new FirefoxDriver(options);
	            return driver;
	        }
	        if (browserName.toLowerCase().contains("edge")) {
	        	System.out.println("Running edge ############"+ConfigurationManager.getBundle().getString("webdriver.edge.driver"));
	        	System.setProperty("webdriver.edge.driver", ConfigurationManager.getBundle().getString("webdriver.edge.driver"));
	        	driver = new EdgeDriver();
	            return driver;
	        }
	        if (browserName.toLowerCase().contains("chrome")) {
	        	System.out.println("value is...."+ConfigurationManager.getBundle().getString("webdriver.chrome.driver"));
	        	System.setProperty("webdriver.chrome.driver", ConfigurationManager.getBundle().getString("webdriver.chrome.driver"));
	        	ChromeOptions options = new ChromeOptions();
	        	options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
	        	options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
	        	options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	        	options.setBinary(ConfigurationManager.getBundle().getString("chromebinarypath"));
	            driver = new ChromeDriver(options);
	            return driver;
	        }
	        return driver;
	    }
	 
	
}
