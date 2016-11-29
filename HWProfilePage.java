package com.WordPress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.WordPress.utils.PropertyUtil;

public class HWProfilePage {
	
	WebDriver driver;
	PropertyUtil propUtil = new PropertyUtil("./resources/object.properties");
	
	public HWProfilePage(WebDriver wdriver)
	{
		driver = wdriver;
	}
	
	/*
	public void Clickprofile()
	{
		WebElement RadioButton = driver.findElement(By.xpath("//img[@class='gravatar']"));
		RadioButton.click();
	}
	*/
	
	public void setFirstName(String firstName) {
		String value = propUtil.getPropertyValue("profile_firstname_text_id");
		WebElement fnelement = driver.findElement(By.id(value));
		fnelement.clear();
		fnelement.sendKeys(firstName);
	}

	public void setLastName(String lastName) {
		String value = propUtil.getPropertyValue("profile_lastnametname_text_id");
		WebElement lnelement = driver.findElement(By.id(value));
		lnelement.clear();
		lnelement.sendKeys(lastName);
	}

	public void setAboutMe(String aboutMeText) {
		String value = propUtil.getPropertyValue("profile_aboutme_text_id");
		WebElement abelement = driver.findElement(By.id(value));
		abelement.clear();
		abelement.sendKeys(aboutMeText);
	}

	public void clickSave() {
		String value = propUtil.getPropertyValue("profile_save_button_xpath");
		WebElement clelement = driver.findElement(By.xpath(value));
		clelement.click();
	}

	public String getTextOnSaveNote() {
		String value = propUtil.getPropertyValue("profile_save_note_span_classname");
		WebElement element = driver.findElement(By.className(value));
		return element.getText();
	}
	
}