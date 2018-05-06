package google.steps;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import framework.BaseDriver;

public class GoogleSteps extends BaseDriver {

	@Given("^I want to open google$")
	public void i_want_to_open_google() throws Throwable {
	    getDriver().navigate().to("https://www.google.com");
	}
	

	@Given("^I want to open flipkart$")
	public void i_want_to_open_flipkart() throws Throwable {
	    getDriver().navigate().to("https://www.flipkart.com");
	  //Assert.assertTrue(false);
	}
}
