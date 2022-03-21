package org.stepdef;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.baseAndPom.BaseClass;
import org.baseAndPom.PageObjectElements;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenOrangeStep extends BaseClass {
	@Given("User Should Open the OpenOrange WebPage")
	public void user_Should_Open_the_OpenOrange_WebPage() throws IOException {
		launchUrl("https://opensource-demo.orangehrmlive.com/");
		TakesScreenshot tk = (TakesScreenshot)driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Britto\\Desktop\\JAVA\\openOrange\\login.png");
		org.openqa.selenium.io.FileHandler.copy(source, des);
   
	}
	@When("User should enter the click login button")
	public void user_should_enter_the_click_login_button() throws IOException, InterruptedException {
		PageObjectElements p = new PageObjectElements();
		enterText(p.getUserId(), excelRead("Sheet1", 0, 0));
		enterText(p.getUserPassword(), excelRead("Sheet1", 1, 0));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		TakesScreenshot tk = (TakesScreenshot) driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Britto\\Desktop\\JAVA\\openOrange\\requirement.png");
		org.openqa.selenium.io.FileHandler.copy(source, des);
		btnclick(p.getLogin());
	}
	@Then("User should click the requirement button")
	public void user_should_click_the_requirement_button() throws IOException, AWTException, Exception {
		PageObjectElements p = new PageObjectElements();
		btnclick(p.getRequirement());
		selectVisibleText(p.getJobtitle(), excelRead("Sheet2", 0, 0));
		robotSelect(p.getJobVacancy());
		robotSelect(p.getManager());
		selectVisibleText(p.getStatus(), excelRead("Sheet2", 2, 0));
		enterText(p.getCandidateName(), excelRead("Sheet2", 3, 0));
		enterText(p.getCandidateKeyword(), excelRead("Sheet2", 4, 0));
		clear(p.getStartDate());
		enterText(p.getStartDate(), excelRead("Sheet2", 5, 0));
		clear(p.getToDate());
		enterText(p.getToDate(), excelRead("Sheet2", 6, 0));
		selectVisibleText(p.getApplication(), excelRead("Sheet2", 7, 0));
		btnclick(p.getSearch());
		Thread.sleep(3000);
		btnclick(p.getAdd());
		TakesScreenshot tk = (TakesScreenshot) driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Britto\\Desktop\\JAVA\\openOrange\\canidateDetails.png");
		org.openqa.selenium.io.FileHandler.copy(source, des);
	   	}
	@Then("select the JobTitle")
	public void select_the_JobTitle() throws IOException, InterruptedException {
		PageObjectElements p = new PageObjectElements();
		enterText(p.getFirstName(), excelRead("Sheet3", 0, 0));
		enterText(p.getLastName(), excelRead("Sheet3", 1, 0));
		enterText(p.getEmail(), excelRead("Sheet3", 2, 0));
		enterText(p.getResume(), excelRead("Sheet3", 4, 0));
		Thread.sleep(3000);
		btnclick(p.getSave());
		TakesScreenshot tk = (TakesScreenshot) driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Britto\\Desktop\\JAVA\\openOrange\\candidateResume.png");
		org.openqa.selenium.io.FileHandler.copy(source, des);
	   	}
}
