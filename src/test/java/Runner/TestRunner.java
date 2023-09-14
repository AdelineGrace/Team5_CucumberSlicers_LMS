package Runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"pretty","html:target/cucumber.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
		monochrome=false,  //console output color
		features = "src/test/resources/Features_LMS", //location of feature files
		glue= {"StepDefinition_LMS","ApplicationHooks"} )

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
