package com.application.test;

import org.testng.annotations.Test;

import com.application.pages.HomePageObjects;


import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.internal.thread.TestNGThread;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.application.pages.BasePage;
import com.application.pages.HomePageObjects;

public class HomepageTests {
	HomePageObjects homePage;
	BasePage bp;

	public  HomepageTests() {
		homePage = new HomePageObjects();
		//bp = new BasePage();
	}

	@Test(enabled=true)
	public void verifytabs() {
	Assert.assertTrue(homePage.womens.isDisplayed());
        
	Assert.assertTrue(homePage.gettxtdresses().isDisplayed());

	Assert.assertTrue(homePage.gettxttshirts().isDisplayed());
	}

	@Test(enabled=true)
	public void gettitle() {
	System.out.println(homePage.womensclick());
	
	System.out.println(homePage.dressesclick());
	
	System.out.println(homePage.tshirtsclick());	
	}
	
	@Test(enabled=true)
	public void verifynewsletter() {
		//homePage.dressesclick();
	homePage.newsletter();
	homePage.getclick().click();
	//homePage.isElementVisible(homePage.getalertdanger());
	//Thread.sleep(3000);
	String success=homePage.getalertdanger().getText();
	System.out.println(success);
	//homePage.checkalert();
	}
	
	@Test(enabled=true)
	public void verifysizes() {
	homePage.dressesclick();
	//homePage.displayes();
    System.out.println(homePage.getSsize());
    System.out.println(homePage.getMsize());
    System.out.println(homePage.getLsize());
	}
	
	/*@Test
	public void productcount() {
		homePage.dressesclick();
   homePage.countmatch();
	}*/
	
	
	@Test(enabled=true)
	public void checkcount() {
	homePage.dressesclick();
  // homePage.countmatch();
    System.out.println(homePage.getcount1().equals(homePage.countmatch()));
	}
	@Test(enabled=true) 
	public void verifyaddcart() {
	homePage.dressesclick();
		//homePage.performaddcart();
	System.out.println(homePage.performaddcart());
	//bp.quitDriver();
	}
}

