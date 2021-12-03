package pagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonPage {
	public WebDriver driver;
	WebElement yes;
	WebElement impressive;
	WebElement no;
	WebElement radioTextYesMsg;
	WebElement radioTextImpressiveMsg;
	WebElement radioTextNoMsg;
	
	public RadioButtonPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getYes() {
		return driver.findElement(By.className("custom-control-label"));
	}
	public WebElement getImpressive() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]/label"));
	}
	public WebElement getNo() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[4]/label"));
	}

	public WebElement getRadioTextYesMsg() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/p"));
	}
	public WebElement getRadioTextImpressiveMsg() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/p"));
	}
	public WebElement getRadioTextNoMsg() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/p"));
	}
	// methods --------------------------------------
	public void clickYes() {
		this.getYes().click();
	}
	public void clickImpressive() {
		this.getImpressive().click();
	}
	public void clickNo() {
		this.getNo().click();
	}

}
