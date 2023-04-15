package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecuteLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./DRIVER/chromedriver.exe");
	}
	public static WebDriver driver;
	
	public static void main(String[] args) {
		 driver =new ChromeDriver();
		 driver.get("https://demo.actitime.com/login.do");
		LoginPage l=new LoginPage(driver);
		l.setLogin("admin","manager");
		
				
	}
	
}
