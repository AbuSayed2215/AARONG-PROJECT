package com.aarong.BaseC;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	
	public static void setUp() {
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().getCookies();
		//driver.get("https://www.aarong.com/");
		driver.get("https://www.aarong.com/");
		//driver.findElement(By.linkText("Customer Service")).click();
		
		
	}
	public static void main(String[] args) {
		//Base.setUp();
	}
}
