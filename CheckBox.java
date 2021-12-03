package pagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBox {
	public WebDriver driver;
	WebElement homeCheckBox;
	WebElement notes;
	WebElement whatIsSelectedText;
	public CheckBox(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getHomeCheckBox() {
		return driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]"));
	}
	public WebElement getNotes() {
		return driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/ol[1]/li[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]"));
	}
	public WebElement getWhatIsSelectedText() {
		return driver.findElement(By.id("result"));
	}
	
	public void markHomeBox(String email) {
		this.getHomeCheckBox().clear();
		this.getHomeCheckBox().click();
	}
	public void markNotesBox(String email) {
		this.getNotes().clear();
		this.getNotes().click();
	}
	
	
	
	
}
