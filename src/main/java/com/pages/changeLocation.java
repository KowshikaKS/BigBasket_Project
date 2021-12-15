package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class changeLocation extends Base{
	@FindBy(xpath="//i[@class='icon svg-header svg-location svg-location-dim']")
	WebElement changeLocationbtn;
	
	@FindBy(xpath="//span[text()='Coimbatore']")
	WebElement newLocation;
	public changeLocation()
	{
		PageFactory.initElements(driver, this);
	}
	public void changeNewLocation()
	{
		try {
			changeLocationbtn.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div/div/div/ul/li[2]/div/div/div[2]/form/div[1]/div/div/span/span[2]/span")).click();
			driver.findElement(By.xpath("//input[@placeholder='Select your city']")).sendKeys("Coimbatore");
			Thread.sleep(4000);
			newLocation.click();
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}