package google.steps;

import org.apache.commons.configuration.ConfigurationException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import framework.BaseDriver;
import framework.ConfigurationManager;
import framework.DriverFactory;

public class Hooks {

	
	
	@Before
    public void beforeScenario(){
		
		
		System.out.println("in Before Scenerio##############################");
		try {
			ConfigurationManager.loadProperties();
		} catch (ConfigurationException e) {
			System.out.println("properties not loaded");
		}
        WebDriver driver=DriverFactory.createInstance(ConfigurationManager.getBundle().getString("browser"));
        BaseDriver.setDriver(driver);
        
    }	
	
	@After
    public void afterScenario(Scenario scenario){
		WebDriver driver = BaseDriver.getDriver();
		if(scenario.isFailed())
		{
			System.out.println("scenerio Name......"+scenario.getName());
			 scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
		}
        	if (driver != null) {
                driver.quit();
        	}		
    }
}
