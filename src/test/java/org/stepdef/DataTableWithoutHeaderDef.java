package org.stepdef;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataTableWithoutHeaderDef {
	WebDriver driver;
	@Given("User is on the OpenOrange WebPage")
	public void user_is_on_the_OpenOrange_WebPage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}

	@When("User enter the below credentials")
	public void user_enter_the_below_credentials(DataTable dataTable) {
		List<String> credential = dataTable.asList(String.class);
		String userName = credential.get(0);
		String userPassword = credential.get(1);
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(userPassword);
	}

	@When("user click the login action")
	public void user_click_the_login_action() {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("User can enter into the homepage")
	public void user_can_enter_into_the_homepage() {
		String title = driver.getTitle();
		boolean contains = title.contains("Orange");
		Assert.assertTrue(contains);
		System.out.println("Validated");
	}
}
