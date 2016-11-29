package com.WordPress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWLoginPage {
WebDriver driver;
	
	public HWLoginPage(WebDriver wdriver)
	{
		driver = wdriver;
	}

	public void setUserName(String userName)
	{
		WebElement userNameElement = driver.findElement(By.id("user_login"));
		userNameElement.clear();
		userNameElement.sendKeys(userName);
	}
	
	public void setPassWord(String passWord)
	{
		WebElement password = driver.findElement(By.id("user_pass"));
		password.clear();
		password.sendKeys(passWord);
	}
	
	public void clickOnLoginButton()
	{
		WebElement LoginBtn = driver.findElement(By.id("wp-submit"));
		LoginBtn.click();
	}
	
	/*
	public void NavigatedLogInPage()
	{
		WebElement exploreDiscover = driver.findElement(By.linkText("Explore Discover"));
		System.out.println(exploreDiscover.getText());
	}
	*/
}
