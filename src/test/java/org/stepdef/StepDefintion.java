package org.stepdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefintion {
	WebDriver driver;

@Given("User should open the orange webpage application")
public void user_should_open_the_orange_webpage_application() {
   WebDriverManager.chromedriver().setup();
   driver = new ChromeDriver();
   driver.get("https://opensource-demo.orangehrmlive.com/");
   driver.manage().window().maximize();
}

@When("User should enter the {string} and {string}")
public void user_should_enter_the_and(String userId, String password) {
   driver.findElement(By.id("txtUsername")).sendKeys(userId);
   driver.findElement(By.id("txtPassword")).sendKeys(password);
}

@And("User should enter the click login button")
public void user_should_enter_the_click_login_button() {
   driver.findElement(By.id("btnLogin")).click();
}

@Then("User should verify the orange webpage application")
public void user_should_verify_the_orange_webpage_application() {
   String title = driver.getTitle();
   boolean contains = title.contains("OrangeHRM");
   Assert.assertTrue(contains);
   System.out.println("validated");
}


}
