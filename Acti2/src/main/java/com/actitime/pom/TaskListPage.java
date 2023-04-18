package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addNewButton;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement newCustomerButton;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[1]")
	private WebElement custName;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement custDesc;
	
	@FindBy(xpath="(//div[.='- Select Customer -'])[1]")
	private WebElement custList;
	
	@FindBy(xpath="(//div[.='Our company'])[9]")
	private WebElement ourCompany;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createCustButton;
//	***********************************
	@FindBy(xpath="//div[.='+ New Project']")
	private WebElement newProjectButton;
	
	@FindBy(xpath="(//input[@placeholder='Enter Project Name'])[2]")
	private WebElement projectName;
	
	@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
	private WebElement projectDesc;
	
	@FindBy(xpath="(//div[@class='searchFilterPlaceholder '])[16]")
	private WebElement customerList;
	
	@FindBy(xpath="(//div[.='Our company'])[4]")
	private WebElement ourCompany2;
	
	@FindBy(xpath="//div[.='Create Project']")
	private WebElement createProjectButton;

	
public WebElement getNewProjectButton() {
		return newProjectButton;
	}
	
	public WebElement getProjectName() {
		return projectName;
	}
	
	public WebElement getProjectDesc() {
		return projectDesc;
	}
	
	public WebElement getcustomerList() {
		return customerList;
	}
	
	public WebElement getOurCompany2() {
		return ourCompany2;
	}
	
	public WebElement getCreateProjectButton() {
		return createProjectButton;
	}
public WebElement getAddNewButton() {
	return addNewButton;
}
public WebElement getNewCustomerButton() {
	return newCustomerButton;
}
public WebElement getCustName() {
	return custName;
}
public WebElement getCustDesc() {
	return custDesc;
}
public WebElement getCustList() {
	return custList;
}
public WebElement getOurCompany() {
	return ourCompany;
}
public WebElement getCreateCustButton() {
	return createCustButton;
}


//**************************************************


@FindBy(xpath="//div[.='+ New Tasks']")
private WebElement newTaskButton;

@FindBy(xpath="(//div[@class='inputPlaceholder'])[18]")
private WebElement TaskCompanyList;

@FindBy(xpath="(//div[.='Our company'])[7]")
private WebElement TaskCompanyName;

@FindBy(xpath="(//div[@class='inputPlaceholder'])[19]")
private WebElement TaskProjList;

@FindBy(xpath="//div[.='Accounting']")
private WebElement TaskProjName;

@FindBy(xpath="//div[.='Create Tasks']")
private WebElement CreateTaskButton;
//************************************************************
public WebElement getnewTaskButton() {
	return newTaskButton;
}
public WebElement getTaskProjList() {
	return TaskProjList;
}
public WebElement getTaskCompanyList() {
	return TaskCompanyList;
}
public WebElement getTaskCompanyName() {
	return TaskCompanyName;
}
public WebElement getTaskProjName() {
	return TaskProjName;
}
public WebElement getCreateTaskButton() {
	return CreateTaskButton;
}

public TaskListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

}
