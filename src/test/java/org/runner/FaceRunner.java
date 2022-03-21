package org.runner;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceRunner {
static WebDriver driver;
@Given("user should open the facebook url")
public void user_should_open_the_facebook_url() {
  WebDriverManager.chromedriver().setup();
  driver = new ChromeDriver();
  driver.get("https://www.facebook.com/");
}

@When("user should enter user id and password")
public void user_should_enter_user_id_and_password() {
  driver.findElement(By.id("email")).sendKeys("britto");
  driver.findElement(By.id("pass")).sendKeys("joseph");
  driver.findElement(By.name("login")).click();
}


@Then("I validate the homepage")
public void i_validate_the_homepage() {
  boolean contains = driver.getTitle().contains("Facebook");
  Assert.assertTrue(contains);  
}


}
