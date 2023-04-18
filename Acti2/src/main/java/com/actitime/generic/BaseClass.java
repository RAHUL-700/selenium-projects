package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./data/chromedriver.exe");
	}
public static WebDriver driver;

@BeforeClass
public void openBrowser(){
	Reporter.log("openbrowser",true);
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@AfterClass
public void closeBrowser() {
	Reporter.log("closebrowser",true);
	driver.close();
}

@BeforeMethod
public void login() {
	Reporter.log("login",true);
	/*LoginPage l=new LoginPage(driver);
	l.setLogin("admin", "manager");*/
	
	driver.get("https://demo.actitime.com/");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='login']")).click();
}

@AfterMethod
public void logout() {
	Reporter.log("logout",true);
	HomePage h=new HomePage(driver);
	h.setLogout();
	
	//driver.findElement(By.id("logoutlink")).click();
}

}

