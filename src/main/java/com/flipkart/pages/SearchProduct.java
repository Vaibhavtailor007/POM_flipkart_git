package com.flipkart.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.base.TestBase;

public class SearchProduct extends TestBase {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	
	By searchLoc = By.name("q");
	By searchbuttonLoc=By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button");
	By laptopLoc=By.xpath("/html/body/div/div/div[3]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]");
	

	
	public void validateSearchProduct(String laptopname) {
		wait(2000);
		driver.findElement(searchLoc).click();
		wait(2000);
		driver.findElement(searchLoc).sendKeys(laptopname);
		wait(2000);
		driver.findElement(searchbuttonLoc).click();
		wait(2000);
		driver.findElement(laptopLoc).click();
		wait(2000);
		
	}
	
	
	

}
