package com.actitime.testscript;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

public class CreateProject extends BaseClass{
@Test
public void createProject() throws InterruptedException, EncryptedDocumentException, IOException {
	String expectedCustName = f.getExcelData("createProject", 2, 1);
	//String desc = f.getExcelData("createCustomer", 2, 2);
	HomePage h=new HomePage(driver);	Thread.sleep(1000);
	w.verifyTitle("Enter Time-Track");
	h.setTask();
	w.verifyTitle("Task List");	Thread.sleep(1000);
	TaskListPage t = new TaskListPage(driver);
	t.getNewProject().click();Thread.sleep(2000);
	t.getSelNewProject().click();Thread.sleep(2000);
	t.getCreatepro().sendKeys(expectedCustName);Thread.sleep(2000);
	t.getProjectName().click();Thread.sleep(2000);
	t.getDesc().click();Thread.sleep(2000);
	t.getCreateProject().click();
}
}
