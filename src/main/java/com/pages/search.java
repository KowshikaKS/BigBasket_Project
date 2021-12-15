package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class search extends Base{
	@FindBy(xpath="//*[@id=\"input\"]")
    WebElement searchBox;
	@FindBy(xpath="//*[@id='navbar-main']/div/div[3]/div/div[1]/button/i[1]")
    WebElement searchBtn;
    public search() {
    	PageFactory.initElements(driver,this);
    }
    public void searchFruits()
	{
		try {
			searchBox.sendKeys("fruits");
			Thread.sleep(4000);
			searchBtn.click();
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public void searchVegetables()
		{
			try {
				searchBox.sendKeys("vegetables");
				Thread.sleep(4000);
				searchBtn.click();
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
		public void searchOil()
		{
			try {
				searchBox.sendKeys("Oil");
				Thread.sleep(4000);
				searchBtn.click();
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}