package com.actitime.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

public class TestCreateProject extends BaseClass{
	static {
		System.setProperty("webdriver.chrome.driver", "./DRIVER/chromedriver.exe");
	}
	public static WebDriver driver;
	@Test
	public void createNewProject() {
		HomePage h=new HomePage(driver);
		h.taskBar();
		TaskListPage tl=new TaskListPage(driver);
		tl.getAddNewButton().click();
		tl.getCreateProjectButton().click();
		tl.getProjectName().sendKeys("Banking project");
		tl.getProjectDesc().sendKeys("hdfc banks project");
		tl.getCustList().click();
		tl.getCustName().click();
		tl.getCreateProjectButton().click();
		 WebElement projName = driver.findElement(By.xpath("//div[@class='titleEditButtonContainer']"));
		 String projText=projName.getText();
		Assert.assertEquals("Banking project",projText );
		WebDriverWait wait =new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(projName));
		
	}
}
