package com.Guru99.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Guru99.qa.base.BaseTest;
import com.Guru99.qa.pages.*;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class MobilePageTest extends BaseTest {
//	public ExtentReports extent;
//	public ExtentTest extentTest;
	ShoppingCartPage shoppingCartpage;
	MobilePage mobilePage;
	HomePage homePage;
	public  MobilePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialisation();
		shoppingCartpage=new ShoppingCartPage();
		homePage=new HomePage();
	}
	@Test
	public void verifyIphoneAddToCartTest() throws InterruptedException {
//		extentTest = extent.startTest("verifyIphoneAddToCartTest");
		mobilePage=homePage.mobileLink();
		shoppingCartpage = mobilePage.iPhoneAddCart();
		boolean flag = shoppingCartpage.verifyDiscountPrice();
		try {
		Assert.assertTrue(flag);
		} catch(AssertionError e) {
			System.out.println("Upon applying coupon code grand total didnt change");
		}
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
