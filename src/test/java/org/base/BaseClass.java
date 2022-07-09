package org.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static void chromeBrowserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}
	
	public static void urlLaunch(String url) {
		driver.get(url);

	}
	
	public static void fillTxt(WebElement ele, String text) {
		ele.sendKeys(text);

	}
	
	public static void buttonClick(WebElement ele) {
		ele.click();

	}
	
	public static void maxBrowser() {
		driver.manage().window().maximize();

	}
	
	public static void implicitWaitTime() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	
	public static void closeBrowser() {
		driver.quit();

	}

}
