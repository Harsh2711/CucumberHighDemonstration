package google.steps;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import framework.BaseDriver;
import google.pages.GoogleHomePage;

public class GoogleSteps extends BaseDriver {

	@Given("^I want to open google$")
	public void i_want_to_open_google() throws Throwable {
	    getDriver().navigate().to("https://www.google.com");
	    GoogleHomePage homePage=new GoogleHomePage();
	    homePage.EnterInputElement("https://www.linkedin.com/in/harshit-trivedi-9b844163");
	}
	

	@Given("^I want to open flipkart$")
	public void i_want_to_open_flipkart() throws Throwable {
	    getDriver().navigate().to("https://www.flipkart.com");
	  Assert.assertTrue(false);
	}
}
