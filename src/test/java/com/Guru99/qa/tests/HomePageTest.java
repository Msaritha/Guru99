package com.Guru99.qa.tests;




import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Guru99.qa.base.BaseTest;
import com.Guru99.qa.pages.HomePage;
import com.Guru99.qa.pages.MobilePage;
import com.Guru99.qa.util.TestUtil;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class HomePageTest extends BaseTest {
	
//	public ExtentReports extent;
//	public ExtentTest extentTest;
	HomePage hp;
	public HomePageTest() {
		super();
	}


	@BeforeMethod
	public void setUp() {
		initialisation();
		hp=new HomePage();
	}
	
	@Test(priority=1)
	public void homepageTitleTest() {
//		extentTest = extent.startTest("homepageTitleTest");
		String title = hp.validateTitle();
		Assert.assertEquals(title, TestUtil.TITLE_HOMEPAGE);
	}
	@Test(priority=2)
	public void logoGuru99Test() {
//		extentTest = extent.startTest("logoGuru99Test");
		boolean flag = hp.validateLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void mobileLinkTest() {
//		extentTest = extent.startTest("mobileLinkTest");
		MobilePage mp=hp.mobileLink();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
