package com.flipkart.pages;

import java.sql.Driver;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.base.TestBase;

public class addToCart extends TestBase {
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	By laptopLoc=By.xpath("/html/body/div/div/div[3]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]");
	By addtocartLoc=By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button");
	By pincodeLoc=By.xpath("//*[@id=\"pincodeInputId\"]");
	
	public void validateAddToCart(String pincode) {
		
		  Set<String> windowHandles=driver.getWindowHandles();
		  System.out.println("Number of opened windows: "+windowHandles.size());
		  
		  
		/*  
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(pincodeLoc).clear();
		driver.findElement(pincodeLoc).sendKeys(pincode);
		
	  Set<String> windowHandles=driver.getWindowHandles();
	  System.out.println("Number of opened windows: "+windowHandles.size());
	  */

	  
	}

}
