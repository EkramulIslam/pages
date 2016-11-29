package com.WordPress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver wdriver)
	{
		driver = wdriver;
	}
	
	public void clickOnLoginLink()
	{
		WebElement SignInLink = driver.findElement(By.partialLinkText("In"));
		SignInLink.click();
	}
	
}
