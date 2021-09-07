package com.qa.testscript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.qa.pages.FooterLinksPage;

public class TC_FooterLinks_008 extends TestBase{
	
	FooterLinksPage pages;
	int count =1; 
	@Test
	public void checkFooterLinks() throws InterruptedException {
		System.out.println(count++);
		/*
		 * Alert alert = driver.switchTo().alert(); System.out.println("FJDJG");
		 * alert.accept();
		 */pages = new FooterLinksPage(driver);
		System.out.println(count++);
		Actions action = new Actions(driver);
		
		action.moveToElement(pages.getHomeLink()).click();
		Thread.sleep(5000);
		System.out.println(count++);
		
		action.moveToElement(pages.getPrivacyPolicyLink()).click();
		Thread.sleep(5000);
		System.out.println(count++);

		action.moveToElement(pages.getTermsAndConditions()).click();
		Thread.sleep(5000);
		System.out.println(count++);

		action.moveToElement(pages.getGstInformation()).click();
		Thread.sleep(5000);
		System.out.println(count++);

		action.moveToElement(pages.getSiteMap()).click();
		Thread.sleep(5000);
		System.out.println(count++);

		
		
		
		
		 
		
	}

}
