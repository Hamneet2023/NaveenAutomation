package com.naveenautomationlabs.AutomationFramework.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.asserts.SoftAssert;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class YourStore extends TestBase {

	public YourStore() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "ul.list-inline>li:nth-of-type(2)>a")
	private WebElement myAccountBtn;

	@FindBy(css = "ul.dropdown-menu>li:nth-of-type(1)>a")
	private WebElement registerBtn;
	
	@FindBy(css = "ul.dropdown-menu>li:nth-of-type(2)>a")
	private WebElement LoginDropdownBtn;

	@FindBy(xpath = "//a[text()=\"iPhone\"]")
	private WebElement iphoneLink;

	public YourStore clickMyAccountBtn() {
		myAccountBtn.click();
		return new YourStore();
	}

	public RegisterAccount clickRegisterBtn() {
		registerBtn.click();
		return new RegisterAccount();
	}
	
	public AccountLogin clickDropdownLoginBtn() {
		 LoginDropdownBtn.click();
		return new AccountLogin();
	}

	public boolean FeaturedImages(String enteredText) {
		List<WebElement> options = wd.findElements(By.cssSelector("#content>div.row>div h4>a"));
		for (WebElement option : options) {
			// System.out.println(option.getText());
			if (option.getText().equalsIgnoreCase(enteredText)) {
				return true;
			}
		}
		return false;
	}

	public boolean navigationBarLinks(String enteredLink) {
		List<WebElement> navLinks = wd.findElements(By.cssSelector("#column-right div.list-group>a"));
		for (WebElement link : navLinks) {
			// System.out.println(link.getText());
			if (link.getText().equalsIgnoreCase(enteredLink)) {
				link.click();
				return true;
			}
		}
		return false;
	}

	public void movingpictures() {

	}

}
