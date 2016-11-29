package com.WordPress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.wordpress.utils.PropertyUtil;

public class HWDashBoardPage {
	WebDriver driver;
	PropertyUtil propUtil = new PropertyUtil("./resources/Object.properties");
	public HWDashBoardPage(WebDriver wdriver)
	{
		driver = wdriver;
	}
	
	public void clickProfile()
	{
		String value = propUtil.getPropertyValue("dashboard_profile_button_xpath");
		WebElement element = driver.findElement(By.xpath(value));
		element.click();
	}


}
