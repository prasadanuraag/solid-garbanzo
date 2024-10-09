package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
	@Test
public void createCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
		String expectedCustName = f.getExcelData("createCustomer", 2, 1);
		String desc = f.getExcelData("createCustomer", 2, 2);
		Thread.sleep(1000);
		w.verifyTitle("Enter Time-Track");
		HomePage h=new HomePage(driver);	Thread.sleep(1000);
		h.setTask();
		w.verifyTitle("Task List");	Thread.sleep(1000);
		TaskListPage t=new TaskListPage(driver);
		t.getAddNewButton().click();	Thread.sleep(1000);
		t.getNewCustomerButton().click();	Thread.sleep(1000);
		t.getCustNameTbx().sendKeys(expectedCustName);	Thread.sleep(1000);
		t.getCustDescTbx().sendKeys(desc);	Thread.sleep(1000);
		t.getCompanyDropdown().click();	Thread.sleep(1000);
		t.getOurCompanyOpt().click();	Thread.sleep(1000);
		t.getCreateCustomerBtn().click();	Thread.sleep(1000);
		String actualCustName = t.getCreatedCustomerName().getText();	Thread.sleep(1000);
		Assert.assertEquals(actualCustName, expectedCustName);}
	
	@Test
		 public void DeleteCustomer() {
		    HomePage h=new HomePage(driver);
		    h.setTask();
		    w.verifyTitle("Enter Time-Track");
			TaskListPage t=new TaskListPage(driver);
			w.verifyTitle("Enter Time-Track");
			t.getSeachbtn().click();
			t.getSearchTxt().click();
			w.verifyTitle("Enter Time-Track");
			t.getAction().click();
			t.getDelete().click();
			t.getDelPermanently().click();
			
		
		}

}
