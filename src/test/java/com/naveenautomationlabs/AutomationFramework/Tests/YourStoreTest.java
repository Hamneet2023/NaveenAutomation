package com.naveenautomationlabs.AutomationFramework.Tests;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;
import com.naveenautomationlabs.AutomationFramework.pages.MyAccount;
import com.naveenautomationlabs.AutomationFramework.pages.MyAccountHasBeenCreated;
import com.naveenautomationlabs.AutomationFramework.pages.RegisterAccount;
import com.naveenautomationlabs.AutomationFramework.pages.YourStore;

public class YourStoreTest extends TestBase {
	YourStore yourStore;
	RegisterAccount registerAccount;
	MyAccountHasBeenCreated myAccountCreated;
	MyAccount myAccount;
	Scanner sc;

	@BeforeMethod
	public void setUp() {
		intialisation();
		yourStore = new YourStore();
		sc = new Scanner(System.in);
	}
//	
//	 @Test(priority=1)
//	 void validatedisplayedFeaturedImagesText() {
//		System.out.print("Enter the text: ");
//		String searchText = sc.nextLine();
//        Assert.assertTrue(yourStore.FeaturedImages(searchText), "Image is not available for this text");
//	}
//	@Test(priority=2)
//	public void validateSideNavigationBarLinks() {
//		yourStore.clickMyAccountBtn();
//		registerAccount=yourStore.clickRegisterBtn();
//		System.out.print("Enter the link: ");
//		String searchLink = sc.nextLine();
//        Assert.assertTrue(yourStore.navigationBarLinks(searchLink), "Link is not available for this text");
//	}

	@AfterMethod
	public void quit() {
		tearDown();
		sc.close();
	}

}
