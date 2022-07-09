package org.pojo;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayPage extends BaseClass{
	
	public EbayPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='gh-ac']")
	private WebElement txtSearchField;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement searchButton;
	
	@FindBy(xpath = "//h3[@class='s-item__title' and not(contains(text(),'Shop on eBay'))]")
	private List<WebElement> allProductsList;
	
	@FindBy(xpath = "//div[contains(text(),'Price:')]//following-sibling::div//span[@id='prcIsum']")
	private WebElement productPrice;

	public WebElement getTxtSearchField() {
		return txtSearchField;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public List<WebElement> getAllProductsList() {
		return allProductsList;
	}

	public WebElement getProductPrice() {
		return productPrice;
	}
	
	

}
