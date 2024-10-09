package com.actitime.testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCreateProject {

	public static void main(String[] args) {
 WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("http://localhost/login.do");
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.xpath("//div[text()='Login ']")).click();
driver.findElement(By.linkText("TASKS")).click();
driver.findElement(By.xpath("//div[text()='Add New']")).click();
driver.findElement(By.xpath("//div[text()='+ New Project']")).click();
driver.findElement(By.id("projectPopup_projectNameField")).sendKeys("manage");
driver.findElement(By.id("ext-comp-1019")).click();
driver.findElement(By.id("ext-gen108")).click();
driver.findElement(By.id("projectPopup_projectDescriptionField")).sendKeys("testing");
driver.findElement(By.xpath("//span[text()='Create Project']")).click();


		
	}}
