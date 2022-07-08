package com.flipakart.testscenarios;

import org.testng.annotations.Test;

import com.flipkart.base.TestBase;
import com.flipkart.pages.LoginPage;
import com.flipkart.pages.SearchProduct;
import com.flipkart.pages.addToCart;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class PlaceOrder extends TestBase {
	@Test
	public void logintest() {
		LoginPage loginPage = new LoginPage();
		loginPage.validateLogin("9680125577", "Vaibhavt00");
		

	}

	@Test
	public void searchProducttest() {
		SearchProduct prod=new SearchProduct();
		prod.validateSearchProduct("Hp probook");
		
	}

	@Test
	public void addToCarttest() {
	    addToCart add=new addToCart();
	    add.validateAddToCart("313203");
	}
	
	

	@Test
	public void placeOrdertest() {
	}

	@Test
	public void makePayment() {
	}

	@Test
	public void logOuttest() {
	}

	@BeforeClass
	public void setUp() {
		lanuchBrowser();
		navigateToURL();
	}

	@AfterClass
	public void afterClass() {
		
	}

}
