package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAndSignupPage {
	public WebDriver driver;

	public LoginAndSignupPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "")
	public WebElement signup;

	@FindBy(xpath = "//*[@id='main-container']/div/div[1]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[2]/div")
	public WebElement title;

	@FindBy(xpath = "//input[@placeholder='e.g. John']")
	public WebElement Firstname;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/div[2]/div[3]/div/div[2]/input")
	public WebElement Lastname;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/div[2]/div[4]/div/div[2]/div")
	public WebElement Countrydropdown;

	@FindBy(xpath = "//*[@id='main-container']/div/div[1]/div/div[2]/div/div/div/div[1]/div[7]/div[2]/div[1]/select")
	public WebElement Date;

	@FindBy(xpath = "//*[@id='main-container']/div/div[1]/div/div[2]/div/div/div/div[1]/div[7]/div[2]/div[2]/select")
	public WebElement Month;

	@FindBy(xpath = "//*[@id='main-container']/div/div[1]/div/div[2]/div/div/div/div[1]/div[7]/div[2]/div[3]/select")
	public WebElement Year;

	@FindBy(xpath = "//*[@id='main-container']/div/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div/div[2]/div/input")
	public WebElement Contactnumber;

	@FindBy(xpath = "//*[@id='main-container']/div/div[1]/div/div[2]/div/div/div/div[3]/div[1]/div/div[2]/div/input")
	public WebElement Password;

	@FindBy(xpath = "//*[@id='main-container']/div/div[1]/div/div[2]/div/div/div/div[3]/div[2]/div/div[2]/div/input")
	public WebElement Confirmpassword;

	@FindBy(xpath = "//*[@id='main-container']/div/div[1]/div/div[2]/div/div/div/div[4]/div[1]/div/div/div/svg")
	public WebElement RadioButton;

	@FindBy(xpath = "//*[@id='main-container']/div/div[1]/div/div[2]/div/div[2]/div/div[5]/div")
	public WebElement SubmitButton;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/div[2]/div[9]/div/div[2]/input")
	public WebElement EmailAddress;

	public WebElement getSignup() {
		return signup;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getLastname() {
		return Lastname;
	}

	public WebElement getCountrydropdown() {
		return Countrydropdown;
	}

	public WebElement getDate() {
		return Date;
	}

	public WebElement getMonth() {
		return Month;
	}

	public WebElement getYear() {
		return Year;
	}

	public WebElement getContactnumber() {
		return Contactnumber;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getConfirmpassword() {
		return Confirmpassword;
	}

	public WebElement getRadioButton() {
		return RadioButton;
	}

	public WebElement getSubmitButton() {
		return SubmitButton;
	}

	public WebElement getEmailAddress() {
		return EmailAddress;
	}

}
