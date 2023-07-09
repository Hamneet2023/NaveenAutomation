package com.naveenautomationlabs.AutomationFramework.Tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;
import com.naveenautomationlabs.AutomationFramework.pages.AccountLogin;
import com.naveenautomationlabs.AutomationFramework.pages.MyAccount;
import com.naveenautomationlabs.AutomationFramework.pages.MyAccountHasBeenCreated;
import com.naveenautomationlabs.AutomationFramework.pages.MyWishListTable;
import com.naveenautomationlabs.AutomationFramework.pages.MyWishListTable.MyWishListTableEnum;
import com.naveenautomationlabs.AutomationFramework.pages.RegisterAccount;
import com.naveenautomationlabs.AutomationFramework.pages.YourStore;

public class MyWishListTableTest extends TestBase {
	YourStore yourStore;
	RegisterAccount registerAccount;
	AccountLogin accountLogin;
	MyAccountHasBeenCreated myAccountCreated;
	MyWishListTable wishList;
	MyAccount myAccount;

	@BeforeMethod
	public void setUp() {
		intialisation();
		yourStore = new YourStore();
	}

//	@Test
//	public void validateMyWishListTable() {
//		yourStore.clickMyAccountBtn();
//		accountLogin = yourStore.clickDropdownLoginBtn();
//		myAccount = accountLogin.loginPortal();
//		wishList = myAccount.clickWishListBtn();
//	}
//	@Test
//	public void testTableIndex() {
//	int val=wishList.getIndexOfColumn(MyWishListTableEnum.UNIT_PRICE);
//	System.out.println(val);
//	}
	
//	@Test
//	public void testTableIndex() {
//	WebElement element=	wishList.getCellElementFromTable(MyWishListTableEnum.PRODUCT_NAME,"Product 15");
//		System.out.println(element.getText());
//	}
//	
	
	@AfterMethod
	public void quit() {
		tearDown();
	}

}
