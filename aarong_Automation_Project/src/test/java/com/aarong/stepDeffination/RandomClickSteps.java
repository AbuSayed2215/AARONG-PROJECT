package com.aarong.stepDeffination;
import java.util.concurrent.TimeUnit;
import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import com.aarong.BaseC.Base;
import com.aarong.utilities.Tools;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RandomClickSteps extends Base{
	
	@When("User open the drop down and able to select shopping country")
	public void user_open_the_drop_down_and_able_to_select_shopping_country() {
		Actions hover = new Actions(driver);
	    hover.moveToElement(driver.findElement(By.linkText("USA"))).build().perform();
	    
	
	   }
	

	@Then("User will see the shopping home page")
	public void user_will_see_the_shopping_home_page() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.linkText("USA")).click(); 
	    
	    
	}
@When("User click on the find store button")
public void user_click_on_the_find_store_button() { // 
	//Tools.getExplicitWait(driver.findElement(By.xpath("(//*[text()='Find a Store'])[1]"), 40);
	driver.findElement(By.xpath("(//*[text()='Find a Store'])[1]")).click();
    
}

@Then("User type the store location")
public void user_type_the_store_location() {
	 	driver.findElement(By.xpath("(//*[@type='text'])[2]")).click();
	    driver.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys("Uttara");
	    driver.findElement(By.xpath("(//*[@type='text'])[2]")).submit();
	    
}

}


