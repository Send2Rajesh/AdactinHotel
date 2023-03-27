package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\Feature",glue = "Stepdefination",
stepNotifications = true,tags = "@TC-101",dryRun = false,monochrome = true,
plugin = {"pretty","html:target\\report\\Automationreport.html",
		"json:target\\report\\Automationreport.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},publish = false)

public class TestRunner {

}
