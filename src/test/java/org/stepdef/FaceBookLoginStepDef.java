package org.stepdef;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookLoginStepDef {
	WebDriver driver;
	@Given("User must open the browser and launch the facebook url")
	public void user_must_open_the_browser_and_launch_the_facebook_url() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("User must enter the {string} and {string} Login Details")
	public void user_must_enter_the_and_Login_Details(String id, String pass) {
		driver.findElement(By.id("email")).sendKeys(id);
		driver.findElement(By.id("pass")).sendKeys(pass);
	}

	@And("User must click the login button")
	public void user_must_click_the_login_button() {
		driver.findElement(By.name("login")).click();
	}
	@Then("User must verify the homepage")
	public void user_must_verify_the_homepage() {
	   
	   System.out.println("Verified");
	}
	
}


