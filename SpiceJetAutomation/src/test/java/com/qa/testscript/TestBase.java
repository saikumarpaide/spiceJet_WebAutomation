package com.qa.testscript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.LoginAndSignupPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	LoginAndSignupPage loginandSignupPage;
	public WebDriver driver;
	@Parameters("SignupURL")
	@BeforeClass
	public void setUp(String url) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		//driver.switchTo().alert().accept();
		System.out.println("Before Suite");
	}
	@AfterClass
	public void tearDown() {
		if(driver!=null) {
			System.out.println("After Class");
			driver.close();driver.quit();
		}
	}
		
	

}
