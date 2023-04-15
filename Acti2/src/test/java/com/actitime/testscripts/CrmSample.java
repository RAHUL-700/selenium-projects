package com.actitime.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CrmSample {
static {
	System.setProperty("webdriver.chrome.driver", "./DRIVER/chromedriver.exe");
}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("http://192.168.241.128:8080");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
driver.findElement(By.xpath("//input[@id='passWord']")).sendKeys("123456");
driver.findElement(By.xpath("//input[@title='Sign In']")).click();
driver.findElement(By.xpath("//a[.='Campaigns']")).click();
driver.findElement(By.xpath("//input[@value='New Campaign']")).click();
//entering details into create campaign page
driver.findElement(By.xpath("//input[@name='property(Campaign Name)']")).sendKeys("Raju1");
driver.findElement(By.xpath("//input[@name='property(Start Date)']")).sendKeys("04/15/2023");
driver.findElement(By.xpath("//input[@name='property(Expected Revenue)']")).sendKeys("100000000");
driver.findElement(By.xpath("//input[@name='property(Actual Cost)']")).sendKeys("20000");
driver.findElement(By.xpath("//input[@name='property(Num sent)']")).sendKeys("2000");
driver.findElement(By.xpath("//input[@name='property(End Date)']")).sendKeys("04/22/2023");
driver.findElement(By.xpath("//input[@name='property(Budgeted Cost)']")).sendKeys("80000000");
driver.findElement(By.xpath("//input[@name='property(Expected Response)']")).sendKeys("200");
WebElement typebox = driver.findElement(By.xpath("//select[@name='property(Type)']"));
WebElement statusbox = driver.findElement(By.xpath("//select[@name='property(Status)']"));
Select s1=new Select(typebox);
s1.selectByVisibleText("Email");
Select s2=new Select(statusbox);
s2.selectByVisibleText("Active");
driver.findElement(By.xpath("//textarea[@name='property(Description)']")).sendKeys("Raju description");
driver.findElement(By.xpath("//input[@value='Save']")).click();
String campName = driver.findElement(By.xpath("//span[.='Raju1']")).getText();
if(campName.equals("Raju1")) {
	System.out.println("Campaign name is displayed correctly");
}
else
	System.out.println("campaign not created properly");
driver.findElement(By.xpath("//a[.='Campaigns']")).click();
String camplistname = driver.findElement(By.xpath("//a[@href='/crm/ShowEntityInfo.do?id=6604&module=Campaigns']")).getText();
System.out.println(camplistname);
if(camplistname.equals("Raju1")) 
	System.out.println("campaign correct");
else
	System.out.println("campaign wrong");

driver.close();
	}

}
