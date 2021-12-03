package pagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPage {
	public WebDriver driver;
	WebElement elementsPageName;
	WebElement textbox;
	WebElement checkbox;
	WebElement radiobutton;
	WebElement webTables;
	WebElement buttons;
	WebElement links;
	WebElement brokenLinks;
	WebElement uploadDownl;
	WebElement dynamicProp;
	
	
	public ElementsPage (WebDriver driver) {
		super();
		this.driver= driver;
	}
	

	public WebElement getElementsPageName() {
		return driver.findElement(By.cssSelector(".div:nth-child(4).div.body-height:nth-child(2).div.container.playgound-body.div.pattern-backgound.playgound-header.>.div.main-header"));
	}
	public WebElement getTextbox() {
		return driver.findElement(By.id("item-0"));
	}
	public WebElement getCheckbox() {
		return driver.findElement(By.id("item-1"));
	}
	public WebElement getRadiobutton() {
		return driver.findElement(By.id("item-2"));
	}
	public WebElement getWebTables() {
		return driver.findElement(By.id("item-3"));
	}
	public WebElement getButtons() {
		return driver.findElement(By.id("item-4"));
	}
	public WebElement getLinks() {
		return driver.findElement(By.id("item-5"));
	}
	public WebElement getBrokenLinks() {
		return driver.findElement(By.id("item-6"));
	}
	public WebElement getUploadDownl() {
		return driver.findElement(By.id("item-7"));
	}
	public WebElement getDynamicProp() {
		return driver.findElement(By.id("item-8"));
	}

	//methods --------------------------------------
	
	public void clickTextbox() {
		this.getTextbox().click();
	}
	public void clickCheckbox() {
		this.getCheckbox().click();
	}
	public void clickRadiobutton() {
		this.getRadiobutton().click();
	}
	public void clickWebTables() {
		this.getWebTables().click();
	}
	public void clickButtons() {
		this.getButtons().click();
	}
	public void clickLinks() {
		this.getLinks().click();
	}
	public void clickBrokenLinks() {
		this.getBrokenLinks().click();
	}
	public void clickUploadDownl() {
		this.getUploadDownl().click();
	}
	public void clickDynamicProp() {
		this.getDynamicProp().click();
	}
	
	// get page name text for verifying that user is on matching page 
	public String elementsPageNameText() {
		return getElementsPageName().getText();
	}

}


