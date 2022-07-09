package org.step;

import java.util.Set;

import org.base.BaseClass;
import org.junit.Assert;
import org.pojo.EbayPage;
import org.pojo.GmailPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef extends BaseClass{
	GmailPage gmailPage;
	EbayPage ebayPage;
	@Given("User will launch the browser and hit the url")
	public void user_will_launch_the_browser_and_hit_the_url() {
	    chromeBrowserLaunch();
	    maxBrowser();
	    urlLaunch("https://accounts.google.com/");
	    implicitWaitTime();
	}

	@When("User will enter the username and click next button")
	public void user_will_enter_the_username_and_click_next_button() {
		gmailPage = new GmailPage();
	    fillTxt(gmailPage.getTxtEmail(), "log686404@gmail.com");
	    buttonClick(gmailPage.getNextButton());
	}

	@When("User will enter the password and click next button")
	public void user_will_enter_the_password_and_click_next_button() throws InterruptedException {
	    Thread.sleep(3000);
		fillTxt(gmailPage.getTxtPass(), "Logesh007");
	    buttonClick(gmailPage.getNextButton());
	}

	@Then("User will verify the successful login by user profile icon in top right corner")
	public void user_will_verify_the_successful_login_by_user_profile_icon_in_top_right_corner() {
	    Assert.assertTrue(gmailPage.getMyUserIcon().isDisplayed());
	}
	

	@Then("User should verify if sign in text in title is not displayed")
	public void user_should_verify_if_sign_in_text_in_title_is_not_displayed() {
		Assert.assertFalse(driver.getTitle().contains("Sign In"));
		closeBrowser();
	}
	
	@Given("User will launch the browser and hit the Url")
	public void user_will_launch_the_browser_and_hit_the_Url() {
		chromeBrowserLaunch();
	    maxBrowser();
	    urlLaunch("https://www.ebay.com/");
	    implicitWaitTime();
	}

	@When("User will enter the given testdate in search field")
	public void user_will_enter_the_given_testdate_in_search_field() {
		ebayPage = new EbayPage();
	   fillTxt(ebayPage.getTxtSearchField(), "Electric guitar");
	}

	@When("User will click the search button")
	public void user_will_click_the_search_button() {
	  buttonClick(ebayPage.getSearchButton());
	}

	@When("User will click the first item from the listed products")
	public void user_will_click_the_first_item_from_the_listed_products() {
		 buttonClick(ebayPage.getAllProductsList().get(0));
	}

	@Then("User will print the product price as output")
	public void user_will_print_the_product_price_as_output() {
		String parId = driver.getWindowHandle();
		Set<String> allId = driver.getWindowHandles();
		for (String eachId : allId) {
			if (!parId.equals(eachId)) {
				driver.switchTo().window(eachId);
			}
		}
	    System.out.println(ebayPage.getProductPrice().getText());
	    closeBrowser();
	}

}
