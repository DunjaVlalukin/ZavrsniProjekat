package pagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginBeginBookStore {
	public WebDriver driver;
	WebElement login;
	WebElement newUser;
	WebElement username;
	WebElement password;
	WebElement register;
	WebElement backToLogin;
	WebElement firstName;
	WebElement lastName;
	WebElement robotCheck;
	WebElement invalidLoginMsg;
	WebElement usernameName;
	
	public LoginBeginBookStore(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getLogin() {
		return driver.findElement(By.id("login"));
	}

	public WebElement getNewUser() {
		return driver.findElement(By.id("newUser"));
	}

	public WebElement getUsername() {
		return driver.findElement(By.id("userName"));
	}

	public WebElement getPassword() {
		return driver.findElement(By.id("password"));
	}

	public WebElement getRegister() {
		return driver.findElement(By.id("register"));
	}

	public WebElement getBackToLogin() {
		return driver.findElement(By.id("gotologin"));
	}

	public WebElement getFirstName() {
		return driver.findElement(By.id("firstname"));
	}

	public WebElement getLastName() {
		return driver.findElement(By.id("lastname"));
	}

	public WebElement getRobotCheck() {
		return driver.findElement(By.cssSelector("#g-recaptcha"));
	}
	public WebElement getInvalidLoginMsg() {
		return driver.findElement(By.id("name"));
	}
	
	public WebElement getUsernameName() {
		return driver.findElement(By.id("userName-value"));
	}


	//methods --------------------------------------
	public void clickRobotCheck() {
		this.getRobotCheck().click();
	}
	public void clickLogin() {
		this.getLogin().click();
	}

	public void inputFirstName() {
		this.getFirstName().clear();
	}
	public void inputLastName() {
		this.getLastName().clear();
	}
	public void inputUserName() {
		this.getUsername().clear();
	}
	public void inputPassword() {
		this.getPassword().clear();
	}
	public void clickNewUser() {
		this.getNewUser().click();
	}
	public void clickRegister() {
		this.getRegister().click();
	}
	

}
