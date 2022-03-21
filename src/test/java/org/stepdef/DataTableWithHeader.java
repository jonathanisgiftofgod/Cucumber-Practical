package org.stepdef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataTableWithHeader {
	WebDriver driver;
@Given("Now User open the OpenOrange WebPage")
public void now_User_open_the_OpenOrange_WebPage() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
}

@When("Now User can enter the below credentials")
public void now_User_can_enter_the_below_credentials(DataTable dataTable) {
  List<Map<String, String>> keyValuePair = dataTable.asMaps(String.class, String.class);
  String userName = keyValuePair.get(0).get("UserName");
  String userPassword = keyValuePair.get(0).get("Password");
  driver.findElement(By.id("txtUsername")).sendKeys(userName);
	driver.findElement(By.id("txtPassword")).sendKeys(userPassword);
}

@And("Now user can click the login action")
public void now_user_can_click_the_login_action() {
  
}

@Then("Now User can see homepage")
public void now_User_can_see_homepage() {
  
}


}
