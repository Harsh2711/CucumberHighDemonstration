package google.pages;

import org.apache.http.client.entity.InputStreamFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.BaseDriver;

public class GoogleHomePage {

	@FindBy(locator="google.home.input")
	public WebElement inputGoogle;
	
	public GoogleHomePage() {
	PageFactory.initElements(BaseDriver.getDriver(), this);
	}
	
	public void EnterInputElement(String value)
	{
		inputGoogle.sendKeys(value+Keys.ENTER);
		
	}
}
