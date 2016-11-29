package com.WordPress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.WordPress.utils.PropertyUtil;

public class ObjectHomePage {
	
	WebDriver driver;
	PropertyUtil propUtil = new PropertyUtil("./resources/object.properties");
	
	public ObjectHomePage(WebDriver wdriver)
	{
		driver = wdriver;
	}
	
	public void clickOnLoginLink()
	{
		String value = propUtil.getPropertyValue("");
		WebElement SignInLink = driver.findElement(By.partialLinkText("In"));
		SignInLink.click();
	}
	
}
