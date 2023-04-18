package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath="//div[@id='container_tasks']")
	private WebElement taskTab;
	
	@FindBy(xpath="//a[.='Logout']")
	private WebElement lOutBtn;
	
	public HomePage(WebDriver driver) {
	 PageFactory.initElements(driver, this);
	}
	
	public void setLogout() {
		lOutBtn.click();
	}
	public void taskBar() {
		taskTab.click();
	}
	
}
