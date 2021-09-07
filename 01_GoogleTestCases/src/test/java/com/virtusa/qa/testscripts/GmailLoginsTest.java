package com.virtusa.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLoginsTest {
	
	static WebDriver driver = null;
	
	
	
	  private static final String CHROME_WEBDRIVER_PATH =
	  "D:\\03.Softwares\\12. Selenium\\chromedriver_win32\\chromedriver.exe" ;
	 private static final String WEB_ADDRESS_TEST = 
			"https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
	
	
	static void startUp() {
		System.setProperty("webdriver.chrome.driver",CHROME_WEBDRIVER_PATH);
		driver = new ChromeDriver();
	}
	
	static void webAddress() {
		driver.get(WEB_ADDRESS_TEST);	
	}
	static void maximizeWindow() { driver.manage().window().maximize();}
	
	static void inputEmailAddress() {
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input"))
		.sendKeys("defa24841@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span"))
		.click();
	}
	static void inputPassword() {
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input"))
		.sendKeys("Saikumar@1");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[2]"))
		.click();
	}
	static void closeReferences() {
		driver.close();
		driver.quit();
	}
	public static void main(String[] args) {
		startUp();
		webAddress();
		maximizeWindow();
		inputEmailAddress();
		inputPassword();
		closeReferences();
	}

}
