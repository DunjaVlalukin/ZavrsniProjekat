package pagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
	public WebDriver driver;
	WebElement topHeader;
	WebElement elements;
	WebElement forms;
	WebElement practiceForm;
	WebElement alerts;
	WebElement browserWindow;
	WebElement subAlerts;
	WebElement widgets;
	WebElement interactions;
	WebElement bookStore;
	WebElement loginBookStore;
	public WebDriverWait wdwait;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public Homepage(WebDriver driver) {
		this.driver= driver;
		this.wdwait = wdwait;
		
	}

	public WebElement getTopHeader() {
		return driver.findElement(By.cssSelector(".body:nth-child(2).div:nth-child(4).header:nth-child(1).a:nth-child(1).>.img:nth-child(1)"));
	}

	public WebElement getElements() {
		return driver.findElement(By.cssSelector(".div.body-height:nth-child(2).div.home-content.div.home-body.div.category-cards.>.div.card.mt-4.top-card:nth-child(1)"));
	}

	public WebElement getForms() {
		return driver.findElement(By.cssSelector(".div.body-height:nth-child(2).div.home-content.div.home-body.div.category-cards.>.div.card.mt-4.top-card:nth-child(2)"));
	}
	

	public WebElement getPracticeForm() {
		return driver.findElement(By.cssSelector(".div.body-height:nth-child(2).div.container.playgound-body.div.row.div.col-12.mt-4.col-md-3:nth-child(1).div.left-pannel.div.accordion.div.element-group:nth-child(2).div.element-list.collapse.show.ul.menu-list.li.btn.btn-light.active.>.span.text:nth-child(2)"));
	}

	public WebElement getAlerts() {
		return driver.findElement(By.cssSelector(".div.body-height:nth-child(2).div.home-content.div.home-body.div.category-cards.>.div.card.mt-4.top-card:nth-child(3)"));
	}
	public WebElement getBrowserWindow() {
		return driver.findElement(By.id("item-0"));
	}
	public WebElement getSubAlerts() {
		return driver.findElement(By.id("item-1"));
	}
	public WebElement getWidgets() {
		return driver.findElement(By.cssSelector(".div.body-height:nth-child(2).div.home-content.div.home-body.div.category-cards.>.div.card.mt-4.top-card:nth-child(4)"));
	}

	public WebElement getInteractions() {
		return driver.findElement(By.cssSelector(".div.body-height:nth-child(2).div.home-content.div.home-body.div.category-cards.>.div.card.mt-4.top-card:nth-child(5)"));
	}

	public WebElement getBookStore() {
		return driver.findElement(By.cssSelector(".div.body-height:nth-child(2).div.home-content.div.home-body.div.category-cards.div.card.mt-4.top-card:nth-child(6).>.div:nth-child(1)"));
	}
	public WebElement getLoginBookStore() {
		return driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/ul[1]/li[1]"));
	}

	public void clickTopHeader() {
		this.getTopHeader().click();
	}
	public void clickElements() {
		js.executeScript("arguments[0].scrollIntoView();", elements);
		wdwait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".div.body-height:nth-child(2).div.home-content.div.home-body.div.category-cards.>.div.card.mt-4.top-card:nth-child(1)")));
		this.getElements().click();
	}
	public void clickForms() {
		this.getForms().click();
	}
	public void clickPracticeForm() {
		this.getPracticeForm().click();
	}
	public void clickSubAlerts() {
		this.getAlerts().click();
	}
	public void clickAlerts() {
		this.getAlerts().click();
	}
	public void  clickBrowserWindow() {
		this.getBrowserWindow().click();
	}
	public void clickWidgets() {
		this.getWidgets().click();
	}
	public void clickInteractions() {
		this.getInteractions().click();
	}
	public void clickBookStore() {
		this.getBookStore().click();
	}
	public void clickLoginBookStore() {
		this.getLoginBookStore().click();
	}

}
