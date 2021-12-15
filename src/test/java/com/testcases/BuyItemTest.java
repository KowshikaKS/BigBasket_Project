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
import com.pages.BuyItem;
public class BuyItemTest extends Base{
	WebDriver driver;
	BuyItem page;
	@BeforeMethod
	public void launchBrowser()
	{
		initializaiton();
		page=new BuyItem();
		
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
	public void orderItems()
	{
		ExtentTest test = extent.createTest("BigBasket Search & Sort Test");
		test.log(Status.INFO, "Test started for popularity search");
		page.orderItems(test);
		test.log(Status.INFO, "Test completed for popularity search");
		
	}
}
