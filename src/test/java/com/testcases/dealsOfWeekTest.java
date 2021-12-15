package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.base.Base;
import com.pages.dealsOfWeek;
public class dealsOfWeekTest extends Base {
	WebDriver driver;
	dealsOfWeek page;
	@BeforeMethod
	public void launchBrowser()
	{
		initializaiton();
		page=new dealsOfWeek();
		
	}
	@AfterMethod
	public void closeSetup()
	{
		tearDown();
	}
	@BeforeTest
	public void reportSetup()
	{
		extentReportSetup();
	}
	@AfterTest
	public void closeReportSetup()
	{
		closeExtentReportSetup();
	}
	@Test
	public void popularity()
	{
		ExtentTest test = extent.createTest("BigBasket deal of week Test");
		test.log(Status.INFO, "Test started for popularity search");
		page.popularity();
		test.log(Status.INFO, "Test completed for popularity search");
		
	}
	
}
