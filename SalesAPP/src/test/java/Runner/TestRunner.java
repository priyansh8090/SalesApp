package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "C:\\MobilAutomation\\Salesapp\\SalesAPP\\src\\test\\java\\Feature",glue = {"StepDefinition", "BaseSales"}, tags= "@login", plugin = "html:targetreport/test.html")

public class TestRunner extends AbstractTestNGCucumberTests  {
	
	
	

}
