package com.qa.testscript;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.LoginAndSignupPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	LoginAndSignupPage loginandSignupPage;
	
	public WebDriver driver;
	@Parameters("url")
	@BeforeClass
	public void setUp(String url) {
		WebDriverManager. edgedriver().setup();
		driver=new EdgeDriver();
		driver.get(url);
		//chromePop();
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
		
	public void firefoxpopupDisbled(){
		FirefoxProfile geoDisabled = new FirefoxProfile();
		geoDisabled.setPreference("geo.enabled", false);
		geoDisabled.setPreference("geo.provider.use_corelocation", false);
		geoDisabled.setPreference("geo.prompt.testing", false);
		geoDisabled.setPreference("geo.prompt.testing.allow", false);
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability(FirefoxDriver.PROFILE, geoDisabled);
		driver = new FirefoxDriver(capabilities);
		
	}
	
	@SuppressWarnings("null")
	public void chromePop() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("test-type");
		options.addArguments("enable-strict-powerful-feature-restrictions");
		options.addArguments("disable-geolocation");
		MutableCapabilities cap = null;
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		cap = cap.merge(DesiredCapabilities.chrome());
		driver = new ChromeDriver(cap);
	}
	

}
