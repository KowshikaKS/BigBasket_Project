package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class dealsOfWeek extends Base{
	@FindBy(xpath="//img[@src='//www.bigbasket.com/media/uploads/banner_images/hp_button_m_09_60_250921.png']")
	WebElement dowBTN;
	@FindBy(xpath="//*[@id=\"sel1\"]/option[1]")
	WebElement pop;
	@FindBy(xpath="//options[text()='Price - Low to High']")
	WebElement P_LH;
	@FindBy(xpath="//options[text()='Price - High to Low']")
	WebElement P_HL;
	@FindBy(xpath="//options[text()='Alphabetical']")
	WebElement alph;
	@FindBy(xpath="//options[text()='Rupee Saving - High to Low']")
	WebElement r_HL;
	@FindBy(xpath="//options[text()='Rupee Saving - Low to High']")
	WebElement r_LH;
	public dealsOfWeek()
	{
		PageFactory.initElements(driver, this);
	}
	public void popularity()
	{
		try {
			dowBTN.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"sel1\"]")).click();
			Thread.sleep(4000);
			P_LH.click();
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}