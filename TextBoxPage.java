package pagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxPage {
	public WebDriver driver;
	WebElement fullName;
	WebElement email;
	WebElement currentAddress;
	WebElement permanentAddress;
	WebElement submitButton;
	
	public TextBoxPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFullName() {
		return driver.findElement(By.id("userName"));
	}

	public WebElement getEmail() {
		return driver.findElement(By.id("userEmail"));
	}

	public WebElement getCurrentAddress() {
		return driver.findElement(By.id("currentAddress"));
	}

	public WebElement getPermanentAddress() {
		return driver.findElement(By.id("permanentAddress"));
	}

	public WebElement getSubmitButton() {
		return driver.findElement(By.id("submit"));
	}
	
	// methods --------------------------------------
	public void insertFullName(String fullName) {
		this.getFullName().clear();
		this.getFullName().sendKeys(fullName);
	}
	public void insertEmail(String email) {
		this.getEmail().clear();
		this.getEmail().sendKeys(email);
	}
	public void insertCurrentAddress(String currentAddress) {
		this.getCurrentAddress().clear();
		this.getCurrentAddress().sendKeys(currentAddress);
	}
	public void insertPermanentAddress(String permanentAddress) {
		this.getPermanentAddress().clear();
		this.getPermanentAddress().sendKeys(permanentAddress);
	}
	public void clickSubmitButton() {
		this.getSubmitButton().click();
	}
	

}
