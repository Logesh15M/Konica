package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailPage extends BaseClass{
	
	public GmailPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@type='email']")
	private WebElement txtEmail;
	
	@FindBy(xpath = "//span[text()='Next']")
	private WebElement nextButton;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement txtPass;
	
	@FindBy(xpath = "//a[contains(@href,'myaccount') and @role='button']")
	private WebElement myUserIcon;
	
	@FindBy(xpath = "//span[contains(text(),'Wrong password.')]")
	private WebElement wrongPasswordText;

	public WebElement getWrongPasswordText() {
		return wrongPasswordText;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getNextButton() {
		return nextButton;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getMyUserIcon() {
		return myUserIcon;
	}
	
	

}
