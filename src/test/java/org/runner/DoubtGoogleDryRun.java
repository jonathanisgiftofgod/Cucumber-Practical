package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Britto\\eclipse-workspace\\CucumberPractical\\src\\test\\resources\\OpenGoogleSearch.feature", 
glue = "org.stepdef", 
dryRun = false,
monochrome = true
//plugin = {"html : report/WebReport", "json:report/jsonreport.json"}
)

public class DoubtGoogleDryRun {

}
