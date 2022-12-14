package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:/March_Batch/Cucumber/src/test/java/features/logIn.feature",
glue="StepDefination",
monochrome = true,dryRun=false,
plugin ={"pretty",
		"html:target/cucumber.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun:target/failed_scenarios.txt"})
public class TestRunnerTest {

}
