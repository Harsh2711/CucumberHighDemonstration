package google;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin =  {"json:results/cucumber-report/cucumber.json"}
             , features= {"classpath:google/features/"},glue="google/steps")
public class RunCukeTest {
	
}
