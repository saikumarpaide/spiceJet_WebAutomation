package com.qa.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.qa.pages.LoginAndSignupPage;

public class TC_SignUp_001 extends TestBase {
	
	public WebDriver driver;

	
	@Test
	public void Signupform() {
		loginandSignupPage = new LoginAndSignupPage(driver);
		System.out.println("@Test0");
		//driver.findElement(By.xpath("//*[@id='main-container']/div/div[1]/div[2]/div/div/div[3]/div[2]/div/div")).click();
		//driver.navigate().to("https://beta.spicejet.com/profile/sign-up");
	
		System.out.println("@Test1");
		sleep();
		/*
		 * Select titleDropdown = new Select(loginandSignupPage.getTitle());
		 * titleDropdown.selectByVisibleText("Miss");
		 */
		//driver.findElement(By.xpath("//*[@id='main-container']/div/div[1]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div[2]/input")).sendKeys("Bhargavi");
		loginandSignupPage.getFirstname().sendKeys("Bhargavi");
		System.out.println("@Test2");
		loginandSignupPage.getLastname().sendKeys("Karanam");
		System.out.println("@Test3");
		sleep();
		Select CountryDropdown = new Select(loginandSignupPage.getCountrydropdown());
		CountryDropdown.selectByValue("India");
		System.out.println("@Test4");
		Select DateDropdown = new Select(loginandSignupPage.getDate());
		DateDropdown.selectByValue("12");
		System.out.println("@Test5");
		Select MonthDropdown = new Select(loginandSignupPage.getMonth());
		MonthDropdown.selectByValue("July");
		sleep();
		System.out.println("@Test6");
		Select YearDropdown = new Select(loginandSignupPage.getYear());
		YearDropdown.selectByValue("2021");
		loginandSignupPage.getContactnumber().sendKeys("9843667247");
		loginandSignupPage.getPassword().sendKeys("Bhargavi*12");
		sleep();
		System.out.println("@Test");
		loginandSignupPage.getConfirmpassword().sendKeys("Bhargavi*12");
		loginandSignupPage.getEmailAddress().sendKeys("vyjpzmviddyrakungx@ianvvn.com");
		loginandSignupPage.getRadioButton().click();
		sleep();
		loginandSignupPage.getSubmitButton().click();
		sleep();
	}

	public void sleep() {
		try {
			Thread.sleep(5000);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}

}
