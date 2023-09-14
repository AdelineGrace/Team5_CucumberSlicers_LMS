package Runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resources/Features_LMS"}, //location of feature files
		glue= {"StepDefinition_LMS","ApplicationHooks"},
		monochrome=false,  //console output color
			
		dryRun = false, 
		plugin = { "pretty",
		"json:target/cucumber-reports/reports.json", 
		"junit:target/cucumber-reports/Cucumber.xml",
		"html:target/cucumber-reports/reports.html", 
		"html:test-output/index.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}, 
		
		publish = true)
		 

public class TestRunner extends AbstractTestNGCucumberTests{
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
				
		return super.scenarios();
    }
	/*@BeforeTest
	@Parameters({"browser"})
	public void defineBrowser(String browser)
	{
		ConfigReader.setBrowserType(browser);
	}*/

}
