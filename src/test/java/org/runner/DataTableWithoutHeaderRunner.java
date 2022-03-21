package org.runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Britto\\eclipse-workspace\\CucumberPractical\\src\\test\\resources\\DataTableWithoutHeader.feature",glue="org.stepdef")
public class DataTableWithoutHeaderRunner {

}
