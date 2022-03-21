package org.stepdef;

import cucumber.api.java.en.Given;

public class ExpressionsStepDef {
	@Given("I have {int} laptop")
	public void i_have_laptop(Integer count) {
		System.out.println("Laptop count " + count);
	}

	@Given("I have a {double} cgpa")
	public void i_have_a_cgpa(Double cgpa) {
		System.out.println("My cgpa score: " + cgpa);
	}

	@Given("{string} is elder than {string} and {string}")
	public void is_elder_than_and(String string, String string2, String string3) {
		System.out.println(string + "is elder to " +string2+ "and" +string3);
	  	}
}
