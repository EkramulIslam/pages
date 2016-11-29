package com.WordPress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWHomePage 
{
	WebDriver driver;
	
	public HWHomePage(WebDriver wdriver)
	{
		driver = wdriver;
	}
	
	public void clickOnLoginLink()
	{
		WebElement SignInLink = driver.findElement(By.partialLinkText("In"));
		SignInLink.click();
	}	
}

