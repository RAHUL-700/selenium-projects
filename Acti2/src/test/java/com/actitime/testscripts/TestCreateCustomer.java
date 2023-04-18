package com.actitime.testscripts;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplimentation.class)
public class TestCreateCustomer extends BaseClass{
static {
	System.setProperty("webdriver.chrome.driver", "./DRIVER/chromedriver.exe");
}
public static WebDriver driver;
	@Test
	public void createNewCustomer() throws InterruptedException {
		Reporter.log("CREATECUSTOMER",true);
		driver.get("https://demo.actitime.com/");
		/*LoginPage l=new LoginPage(driver);
		l.setLogin("admin", "manager");*/
		HomePage h=new HomePage(driver);
		h.taskBar();
		TaskListPage tl=new TaskListPage(driver);
		tl.getAddNewButton().click();
        tl.getNewCustomerButton().click();
		tl.getCustName().sendKeys("HDFC_001");
		tl.getCustDesc().sendKeys("Banking Project");
		tl.getCustList().click();
		tl.getOurCompany().click();
		tl.getCreateCustButton().click();
		String textCust=driver.findElement(By.xpath("//div[@class='titleEditButtonContainer']")).getText();
			Assert.assertEquals("H*DFC_001", textCust);
		Thread.sleep(2000);
		
	}
}
