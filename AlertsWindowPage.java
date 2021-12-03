package pagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertsWindowPage {
	public WebDriver driver;
	WebElement newTab;
	WebElement newWindow;
	WebElement alerts;
	WebElement buttonToSeeAlert;
	WebElement button2;
	public AlertsWindowPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getNewTab() {
		return newTab;
	}
	public WebElement getNewWindow() {
		return driver.findElement(By.id("windowButton"));
	}
	
	public WebElement getAlerts() {
		return alerts;
	}
	public WebElement getbuttonToSeeAlert() {
		return driver.findElement(By.id("alertButton"));
	}
	public WebElement getButton2() {
		return button2;
	}
	// methods --------------------------------------
	public void  clickNewWindow() {
		this.getNewWindow().click();
	}
	
	public void  clickButtonToSeeAlert() {
		this.getbuttonToSeeAlert().click();
	}
	

}
