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
import com.pages.viewOffer;
public class viewOfferTest extends Base {
	 WebDriver driver;
	viewOffer page;
	@BeforeMethod
	public void launchBrowser()
	{
		initializaiton();
		page=new viewOffer();
		
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
	public void viewingoffer() throws InterruptedException
	{
		ExtentTest test = extent.createTest("BigBasket View offers test");
		test.log(Status.INFO, " view offers test started ");
		page.select(test);
		test.log(Status.INFO, " view offers test ended ");
	}
}

