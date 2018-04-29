package framework;

import org.openqa.selenium.WebDriver;

public class BaseDriver {

public static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<WebDriver>();
	
	public static void setDriver(WebDriver drivername) {
		System.out.println("Settinmg up driver");
		threadDriver.set(drivername);
	}

	public static WebDriver getDriver() {
		return threadDriver.get();

	}

}
