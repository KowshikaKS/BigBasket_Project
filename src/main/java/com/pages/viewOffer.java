package com.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.base.Base;

public class viewOffer extends Base{
	@FindBy(xpath="//span[text() ='OFFERS']")
	WebElement offer;
	
	@FindBy(xpath="//*[@id=\"ebe7e51a-dcc1-4ee5-8df6-040276b80c80\"]/div[1]/div/div[2]/div/div/product-template-in-container/div[1]/div[3]/a/img")
	WebElement egg;
	
	@FindBy(xpath="//span[text()='ADD TO BASKET']")
	WebElement add;
	
	public viewOffer()
	{
		PageFactory.initElements(driver, this);
	}
	public void select(ExtentTest test) throws InterruptedException
	{
		offer.click();
		WebDriverWait(driver,Duration.ofSeconds(5));
		FluentWait<WebDriver> wait = null;
		wait.until(ExpectedConditions.visibilityOf(egg));
		egg.click();
		Thread.sleep(4000);
		try
		{
			wait.until(ExpectedConditions.elementToBeClickable(offer));
			test.log(Status.PASS,"Test successful for onions ");
		}
		catch(Exception e)
		{
			test.log(Status.FAIL,"Test failed for onions");
		}
		
		try {
			
			add.click();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	private void WebDriverWait(WebDriver driver, Duration ofSeconds) {
		// TODO Auto-generated method stub
		
	}
}

