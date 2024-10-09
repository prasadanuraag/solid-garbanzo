package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
@FindBy(className = "addNewButton")
private WebElement addNewButton;
@FindBy(xpath="//div[text()='+ New Customer']")
private WebElement newCustomerButton;
@FindBy(id="customerLightBox_nameField")
private WebElement custNameTbx;
@FindBy(id="customerLightBox_descriptionField")
private WebElement custDescTbx;
@FindBy(xpath="//button[contains(text(),'Select an active customer ')]")
private WebElement companyDropdown;
@FindBy(linkText = "Our Company")
private WebElement ourCompanyOpt;
@FindBy(id="customerLightBox_commitBtn")
private WebElement createCustomerBtn;
@FindBy(xpath="//div[@class='tasksTable hasSelectedCustomer']/div[@class='header']/div[@class='title ellipsis']")
private WebElement createdCustomerName;
@FindBy(id="logoutLink")
private WebElement logoutBtn;

/////////////////////////////DeleteModule////////////////////////////
@FindBy(xpath="//input[contains(@placeholder,'Start typing name')]")
private WebElement Seachbtn;
@FindBy(xpath="//span[@class=\\\"highlightToken\\\"]/../..//div[@class=\\\"editButton available\\\"]")
private WebElement SearchTxt;
@FindBy(xpath="//div[text()='ACTIONS']")
private WebElement Action;
@FindBy(xpath="//div[text()='Delete']")
private WebElement Delete;
@FindBy(xpath="//span[text()='Delete permanently']")
private WebElement DelPermanently;
@FindBy(className="innerhtml")
private WebElement innerhtml;

///////////////////////////CreateProject//////////////////////
@FindBy(xpath="//div[text()='Add New']")
private WebElement AddNew;
@FindBy(xpath="//div[text()='+ New Project']")
private WebElement NewProject;
@FindBy(id="projectPopup_projectNameField")
private WebElement SelNewProject;
@FindBy(id="ext-comp-1019")
private WebElement createpro;
@FindBy(id="ext-gen108")
private WebElement projectName;
@FindBy(id="projectPopup_projectDescriptionField")
private WebElement desc;
@FindBy(xpath="//span[text()='Create Project']")
private WebElement createPro;


public TaskListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

///////////////////////////CreateProject//////////////////////

public WebElement getAddNew() {
	return AddNew;
}
public WebElement getNewProject() {
	return NewProject;
}
public WebElement getSelNewProject() {
	return SelNewProject;
}
public WebElement getCreatepro() {
	return createpro;
}
public WebElement getProjectName() {
	return projectName;
}
public WebElement getDesc() {
	return desc;
}
public WebElement getCreateProject() {
	return createPro;
}

public void setLogout() {
	logoutBtn.click();
}
public WebElement getAddNewButton() {
	return addNewButton;
}
public WebElement getNewCustomerButton() {
	return newCustomerButton;
}
public WebElement getCustNameTbx() {
	return custNameTbx;
}
public WebElement getCustDescTbx() {
	return custDescTbx;
}
public WebElement getCompanyDropdown() {
	return companyDropdown;
}
public WebElement getOurCompanyOpt() {
	return ourCompanyOpt;
}
public WebElement getCreateCustomerBtn() {
	return createCustomerBtn;
}
public WebElement getLogoutBtn() {
	return logoutBtn;
}
public WebElement getSeachbtn() {
	return Seachbtn;
}
public WebElement getSearchTxt() {
	return SearchTxt;
}
public WebElement getAction() {
	return Action;
}
public WebElement getDelete() {
	return Delete;
}
public WebElement getDelPermanently() {
	return DelPermanently;
}
public WebElement getCreatedCustomerName() {
	return createdCustomerName;
}

}
