package com.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
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

public class BuyItem extends Base {
	@FindBy(xpath="//h2[text()='Best Sellers']")
	WebElement bestSellerH2;
	
	@FindBy(xpath="//button[text()='Add ']")
	List<WebElement> productsBestSeller;
	
	@FindBy(xpath="//span[contains(text(),'My ')]")
	WebElement myBasket;
	
	@FindBy(xpath="//button[text()='View Basket & Checkout']")
	WebElement viewOrder;
	
	@FindBy(xpath="//p[text()='CHECKOUT ']")
	WebElement checkoutBtn;
	public BuyItem()
	{
		PageFactory.initElements(driver, this);
	}
	public void orderItems(ExtentTest test)
	{
		try
		{
			WebDriverWait(driver,Duration.ofSeconds(5));
			FluentWait<WebDriver> wait = null;
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[8]/carousel-product-widget/section/div[2]/div/div[1]/div/div[1]/div/div/product-template-in-container/div[1]/div[4]/div[3]/div/div[5]/div[2]/button")));
			driver.findElement(By.xpath("/html/body/div[1]/div[8]/carousel-product-widget/section/div[2]/div/div[1]/div/div[1]/div/div/product-template-in-container/div[1]/div[4]/div[3]/div/div[5]/div[2]/button")).click();
			wait.until(ExpectedConditions.visibilityOf(myBasket));
			Actions obj = new Actions(driver);
			obj.click(myBasket).build().perform();
			wait.until(ExpectedConditions.visibilityOf(viewOrder));
			viewOrder.click();
			checkoutBtn.click();
			Thread.sleep(10000);
			test.log(Status.PASS,"Test successfully item");
		}
		catch(Exception e)
		{
			test.log(Status.FAIL,"Test failed ");
			e.printStackTrace();
		}
	}
private void WebDriverWait(WebDriver driver, Duration ofSeconds) {
	// TODO Auto-generated method stub
	
}
}
