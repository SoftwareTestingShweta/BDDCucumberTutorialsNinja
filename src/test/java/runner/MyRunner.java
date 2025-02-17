package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\features"},
		glue = {"stepDefinations","hooks"},
		publish = true,
		plugin ={"pretty","json:target/CucumberReports/CucumberReport.json"}		
		
		)
	

public class MyRunner extends AbstractTestNGCucumberTests {

}
