package runner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (features= {"src//test//java//Features"},glue= {"StepDefinition","Utility"}, plugin= {"pretty","html:target/cucumber"}
, tags= {"@appium"})

@Test
public class RunTest extends AbstractTestNGCucumberTests {
	
	

}
