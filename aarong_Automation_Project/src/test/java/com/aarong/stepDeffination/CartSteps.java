package com.aarong.stepDeffination;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aarong.BaseC.Base;
import com.aarong.pageFactory.ElementPage;
import com.aarong.utilities.Tools;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartSteps extends Base{
	
	ElementPage pf = PageFactory.initElements(driver, ElementPage.class);
	
@When("User seach for {string}")
public void user_seach_for(String String) {
   driver.findElement(By.xpath("//i[@class='icon icon-search']")).click();
   driver.findElement(By.xpath("(//*[@class='input-text'])[1]")).sendKeys("Panjabi");
   driver.findElement(By.xpath("(//*[@class='input-text'])[1]")).submit();
}
@When("User click on the second iteam")
public void user_click_on_the_second_iteam() {
	List<WebElement> element = driver.findElements(By.xpath("//*[@class='product-image-photo']"));
    for (int i = 0; i<element.size(); i++) {
    	if (i>=2) {
    		element.get(i).click();
    		break; 
    	}
    }  
}
@When("User select quantity {int}")
public void user_select_quantity(Integer int1) throws InterruptedException {
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(1));
	Thread.sleep(5000);
	Select quantity = new Select(driver.findElement(By.id("attribute794")));
    quantity.selectByIndex(2);
    

    
}
@Then("User click on the add to cart button")
public void user_click_on_the_add_to_cart_button() throws InterruptedException {
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(1));
	Thread.sleep(3000);
	Select quantity = new Select(driver.findElement(By.id("attribute405")));
    quantity.selectByIndex(1);
   
    
}
@Then("Items quantity should be displayed in the cart")
public void items_quantity_should_be_displayed_in_the_cart() throws InterruptedException {
	Thread.sleep(5000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scroll(0,500)");
	driver.findElement(By.xpath("//button[@class='action primary tocart']")).click();
	Thread.sleep(3000);
	driver.close();
    
}

}
