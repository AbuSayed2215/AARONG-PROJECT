package com.aarong.stepDeffination;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.aarong.BaseC.Base;
import com.aarong.pageFactory.ElementPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NegetiveSteps extends Base {
	
	  ElementPage pf = PageFactory.initElements(driver, ElementPage.class);

@Given("User open the browser and navigate to the application")
public void user_open_the_browser_and_navigate_to_the_application() {
   
   
}

@When("User click on the sign in button on homepage")
public void user_click_on_the_sign_in_button_on_homepage() {
   driver.findElement(By.xpath("//i[@class='icon icon-user']")).click();
   
}

@When("User enter {string}")
public void user_enter(String email) {
   pf.getEnterEmail().sendKeys(email);
   
}

@When("User click enter")
public void user_click_enter() {
   pf.getSubmit().click();
   
}

@When("User type {string}")
public void user_type(String password) {
   pf.getPassword().sendKeys(password);
   
}

@When("User click on the login button")
public void user_click_on_the_login_button() {
	pf.getEnterSingin().click();
   
}

@Then("User is suppose to get an error message")
public void user_am_suppose_to_get_an_error_message() {
   
   
}
}
