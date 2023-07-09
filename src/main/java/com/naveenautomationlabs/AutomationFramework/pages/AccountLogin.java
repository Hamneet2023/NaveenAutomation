package com.naveenautomationlabs.AutomationFramework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class AccountLogin extends TestBase {
	public AccountLogin() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(id = "input-email")
	private WebElement inputEmailTextfield;

	@FindBy(id = "input-password")
	private WebElement inputPasswordTextfield;

	@FindBy(css = "input[value=\"Login\"]")
	private WebElement loginBtn;

	private void enterEmail() {
		inputEmailTextfield.sendKeys("user/@gmail.com");
	}

	private void enterPassword() {
		inputPasswordTextfield.sendKeys("1234");
	}

	private MyAccount clickLoginBtn() {
		loginBtn.click();
		return new MyAccount();
	}

	public MyAccount loginPortal() {
		enterEmail();
		enterPassword();
		return clickLoginBtn();
	}
}
