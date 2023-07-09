package com.naveenautomationlabs.AutomationFramework.pages;

import java.util.Random;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class RegisterAccount extends TestBase {
	public RegisterAccount() {
		PageFactory.initElements(wd, this);
	}

	Random random = new Random();
	int randomInt = random.nextInt(1000);
	String randomEmail = "a1" + randomInt + "@gmail.com";
	@FindBy(id = "input-firstname")
	private WebElement inputFirstNameTextfield;

	@FindBy(id = "input-lastname")
	private WebElement inputLastNameTextfield;

	@FindBy(id = "input-email")
	private WebElement inputEmailTextfield;

	@FindBy(id = "input-telephone")
	private WebElement inputTelephoneTextfield;

	@FindBy(id = "input-password")
	private WebElement inputPasswordTextfield;

	@FindBy(id = "input-confirm")
	private WebElement inputConfirmPasswordTextfield;

	@FindBy(xpath = "(//input[@name=\"newsletter\"] )[1]")
	private WebElement selectNewsletterSubscribeRadioBtn;

	@FindBy(css = "div.pull-right>input:nth-of-type(1)")
	private WebElement selectPrivacyPolicyCheckbox;

	@FindBy(css = "div.pull-right>input:nth-of-type(2)")
	private WebElement registerContinueBtn;

	@FindBy(css = "div.buttons>div.pull-right>a")
	private WebElement registrationAccountcreatedcontinueBtn;

	private void enterFirstName() {
		inputFirstNameTextfield.sendKeys("hh");
	}

	private void enterLastName() {
		inputLastNameTextfield.sendKeys("testLastName");
	}

	private void enterEmail() {
		inputEmailTextfield.sendKeys(randomEmail);
	}

	private void enterTelephoneNumber() {
		inputTelephoneTextfield.sendKeys("123456789");
	}

	private void enterPassword() {
		inputPasswordTextfield.sendKeys("Password2");
	}

	private void enterConfirmPassword() {
		inputConfirmPasswordTextfield.sendKeys("Password2");
	}

	private void selectSubscribeRadioBtn() {
		selectNewsletterSubscribeRadioBtn.click();
	}

	private void selectPrivacyPolicy() {
		selectPrivacyPolicyCheckbox.click();
	}

	private MyAccountHasBeenCreated clickContinueBtn() {
		registrationAccountcreatedcontinueBtn.submit();
		return new MyAccountHasBeenCreated();
	}

	public MyAccountHasBeenCreated registerPortal() {
		enterFirstName();
		enterLastName();
		enterEmail();
		enterTelephoneNumber();
		enterPassword();
		enterConfirmPassword();
		selectSubscribeRadioBtn();
		selectPrivacyPolicy();
		return clickContinueBtn();

	}
}
