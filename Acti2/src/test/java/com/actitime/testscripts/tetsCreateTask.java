package com.actitime.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

public class tetsCreateTask {
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
		tl.getCreateTaskButton().click();
		tl.getTaskCompanyList().click();
		tl.getTaskCompanyName().click();
		tl.getTaskProjList().click();
		tl.getTaskProjName().click();
		tl.getCreateTaskButton().click();
		 WebElement taskName = driver.findElement(By.xpath("//div[@class='titleEditButtonContainer']"));
		 String taskText=taskName.getText();
		Assert.assertEquals("Banking project",taskText );
		WebDriverWait wait =new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(taskName));	
}
}
