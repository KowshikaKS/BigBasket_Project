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
import com.pages.changeLocation;
public class changeLocationTest extends Base{
	 WebDriver driver;
	 changeLocation dp;
		@BeforeMethod
		public void launchBrowser()
		{
			initializaiton();
			dp=new changeLocation();
			
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
		public void changeLocation()
		{
			ExtentTest test = extent.createTest("BigBasket change location Test");
			test.log(Status.INFO, "Test started for Change location");
			dp.changeNewLocation();
			test.log(Status.INFO, "Test completed for Change location");
		}
}
