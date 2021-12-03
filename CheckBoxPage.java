package pagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxPage {
	public WebDriver driver;
	WebElement expandToOpenButton;
	WebElement desktopBox;
	WebElement documentsBox;
	WebElement dowloadsBox;
	WebElement whatIsSelectedMsg;
	WebElement desktopMarked;
	
	public CheckBoxPage(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getExpandToOpenButton() {
		return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button"));
	}
	public WebElement getDesktopBox() {
		return driver.findElement(By.cssSelector(".rct-icon.rct-icon-parent-close"));
	}
	public WebElement getDesktopMarked() {
		return driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[1]/svg"));
	}
	public WebElement getDocumentsBox() {
		return driver.findElement(By.cssSelector(".rct-icon.rct-icon-uncheck"));
	}
	public WebElement getDowloadsBox() {
		return driver.findElement(By.cssSelector(".rct-icon.rct-icon-uncheck"));
	}
	public WebElement getWhatIsSelectedMsg() {
		return driver.findElement(By.xpath("//*[@id=\"result\"]/span[2]"));
	}
	
	// methods --------------------------------------
	public void clickExpandToOpenButton() {
		this.getExpandToOpenButton().click();
	}
	public void clickDesktopBox() {
		this.getDesktopBox().click();
	}
	
	
	
	

}
