package Runner;
//cucucumber options should be written above the class
//plugin -which format you want for report-html
//monochrome-

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features= {"Features/login.feature"},
		glue= {"StepDefination"},
		plugin= {"pretty", "html:target/cucumber-reports","json:target/cucumber_reports/Cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		tags="@radiobutton",
		monochrome= true)
public class TestRunner extends AbstractTestNGCucumberTests
{

}
