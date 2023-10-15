package com.sl.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/Features", ///Users/mrobi/Desktop/IT/TestProjects/SwagLabsBDD/
		glue = {"com.sl.steps"},
		plugin = {"pretty", "html:target/HTMLReports"},
		dryRun = false,
		tags = {"@smoke"}
		)


public class TestRunner {

}
