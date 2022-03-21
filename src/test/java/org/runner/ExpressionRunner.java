package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Britto\\eclipse-workspace\\CucumberLearnOnline\\src\\test\\resources\\expression.feature", glue="org.stepdef")
public class ExpressionRunner {

}
