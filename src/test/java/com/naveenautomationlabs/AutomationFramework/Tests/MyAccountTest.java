package com.naveenautomationlabs.AutomationFramework.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;
import com.naveenautomationlabs.AutomationFramework.pages.AccountLogin;
import com.naveenautomationlabs.AutomationFramework.pages.MyAccount;
import com.naveenautomationlabs.AutomationFramework.pages.MyAccountHasBeenCreated;
import com.naveenautomationlabs.AutomationFramework.pages.MyWishListTable;
import com.naveenautomationlabs.AutomationFramework.pages.RegisterAccount;
import com.naveenautomationlabs.AutomationFramework.pages.YourStore;

public class MyAccountTest extends TestBase {
	YourStore yourStore;
	RegisterAccount registerAccount;
	AccountLogin accountLogin;
	MyAccountHasBeenCreated myAccountCreated;
	// MyWishListTable wishList;
	MyAccount myAccount;

	@BeforeMethod
	public void setUp() {
		intialisation();
		yourStore = new YourStore();
	}

	@Test
	public void test1() {
		Assert.assertEquals("Hamneet", "Kaur", "Expected Hamneet");
	}

	@Test
	public void test() {
		Assert.assertEquals("Hamneet", "Rattanpal", "Expected Hamneet");
	}

	@Test
	public void validateRegisterUsingValidCredentials() {
		yourStore.clickMyAccountBtn();
		registerAccount = yourStore.clickRegisterBtn();
		myAccountCreated = registerAccount.registerPortal();
		// Assert.assertEquals(myAccountCreated.accountHasBeenCreatedGetText(), "Your
		// Account Has Been Created!");
		myAccount = myAccountCreated.continueBtnAfterAccountCreated();
		// Assert.assertEquals(myAccount.getMyAccountText(), "My Account");
	}

	@Test
	public void validateLogin() {
		yourStore.clickMyAccountBtn();
		accountLogin = yourStore.clickDropdownLoginBtn();
		myAccount = accountLogin.loginPortal();
		Assert.assertEquals(myAccount.getMyAccountText(), "My Account");
	}

	@AfterMethod
	public void quit() {
		tearDown();
	}
}