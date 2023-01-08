package com.aarong.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aarong.BaseC.Base;

public class ElementPage extends Base {
	
	public ElementPage(){
		PageFactory.initElements(driver, this);
}
	@FindBy(xpath = "//i[@class='icon icon-user']")
	private WebElement loginButton;
	
	public WebElement getloginButton() {
		return loginButton;
	}
	
	@FindBy(xpath = "(//input[@class='input-text'])[2]")
	private WebElement enterEmail;
	
	public WebElement getEnterEmail() {
		return enterEmail;
	}
	@FindBy(xpath = "//button[@class='action login primary']")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}
	
	@FindBy(xpath = "(//input[@class='input-text'])[3]")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	@FindBy(xpath = "//button[@class='action login primary']")
	private WebElement enterSingin;

	public WebElement getEnterSingin() {
		return enterSingin;
	}
	@FindBy(xpath = "//a[@class='tooltip']")
	private WebElement searchbutton;

	public WebElement getSearchbutton() {
		return searchbutton;
	}
	@FindBy(xpath = "//input[@class='input-text']")
	private WebElement searchBox;

	public WebElement getSearchBox() {
		return searchBox;
	}
	@FindBy(xpath = "//button[@class='action search']")
	private WebElement searchSubmit;

	public WebElement getSearchSubmit() {
		return searchSubmit;
	}
	@FindBy(xpath = "(//img[@class='product-image-photo'])[2]")
	private WebElement clickonIteam;

	public WebElement getClickonIteam() {
		return clickonIteam;
	}
	@FindBy(xpath = "//span[@class='base']")
	private WebElement getPanjabi;

	public WebElement getGetPanjabi() {
		return getPanjabi;
	}

	
	}
	


