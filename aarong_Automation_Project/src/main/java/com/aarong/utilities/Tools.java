package com.aarong.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aarong.BaseC.Base;
import com.google.common.io.Files;

public class Tools extends Base {
	
	public static WebElement getExplicitWait(WebElement elem, long time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elem));
		return element;
	}
	
	public static void takeScreenShoot()  {
		try {
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File targetFile = new File(System.getProperty("user.dir")+"//Screenshot/screenshot.png");
		targetFile.getParentFile().mkdir();
		srcFile.createNewFile();
		Files.copy(srcFile, targetFile);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public static void getHighLighter(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 4px solid red;')", element);
	}
	
	public static void actionsClick(WebElement element) {
		Actions action = new Actions(driver);
		action.click(element).build().perform();
	}
	
	public static void getJsClick(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", element);
	}
	
public static void clickCheckBox(WebElement checkbox) {
	
	if (checkbox.isSelected()) {
		System.out.println("The checkbox is already selected");
	} else if (!checkbox.isSelected()) {
		checkbox.click();
		System.out.println("Now selecting the checkbox");
	} else {
		System.out.println("Checkbox did not select");
	}
	
}

	
}



