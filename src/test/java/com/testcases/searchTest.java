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
import com.pages.search;
public class searchTest extends Base {
	 WebDriver driver;
		search page;
		@BeforeMethod
		public void launchBrowser()
		{
			initializaiton();
			page=new search();
			
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
		public void searchFruits()
		{
			ExtentTest test = extent.createTest("BigBasket search fruits Test");
			test.log(Status.INFO, "Test started for Change location");
			page.searchFruits();
			test.log(Status.INFO, "Test completed for Change location");
		}
		@Test
		public void searchVegetables()
		{
			ExtentTest test = extent.createTest("BigBasket search vegetables Test");
			test.log(Status.INFO, "Test started for Change location");
			page.searchVegetables();
			test.log(Status.INFO, "Test completed for Change location");
		}
		@Test
		public void searchOil()
		{
			ExtentTest test = extent.createTest("BigBasket search oil Test");
			test.log(Status.INFO, "Test started for Change location");
			page.searchOil();
			test.log(Status.INFO, "Test completed for Change location");
		}
}
