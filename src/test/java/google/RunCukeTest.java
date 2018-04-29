package google;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin =  {"json:results/cucumber-report/cucumber.json"}
             , features= {"src/test/java/google/features/test2.feature"},glue="google/steps")
public class RunCukeTest {
	
}
