package org.stepdef;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleStepDef {
	WebDriver driver;
	@Given("User open the google webpage")
	public void user_open_the_google_webpage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	   	}

	@When("User may search the term {string}")
	public void user_may_search_the_term(String string) {
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(string);
	}

	@And("enter the search button")
	public void enter_the_search_button() throws InterruptedException, AWTException {
		WebElement search = driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	

	@Then("verify the various sources")
	public void verify_the_various_sources() {
	System.out.println("verified");
	   	}
}
