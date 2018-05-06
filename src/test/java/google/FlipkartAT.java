package google;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin =  {"json:results/cucumber-report/cucumber1.json"}
             , features= {"src/test/resources/features/flipkart.feature"},glue="google/steps")
public class FlipkartAT {
	
}
