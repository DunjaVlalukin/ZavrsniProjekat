package pagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Forms {
	public WebDriver driver;
	WebElement firstName;
	WebElement lastName;
	WebElement email;
	WebElement genderMale;
	WebElement genderFemale;
	WebElement genderOther;
	WebElement mobile;
	WebElement dateOfBirth;
	WebElement monthPicker;
	WebElement yearPicker;
	WebElement dayPicker;
	WebElement subjects;
	WebElement hobbiesSport;
	WebElement hobbiesReading;
	WebElement hobbiesMusic;
	WebElement picture;
	String imgPath;
	WebElement currentAddress;
	WebElement state;
	WebElement city;
	WebElement submitButton;
	WebElement submitedFormMsg;
	Select drpMonth = new Select (driver.findElement(By.className("react-datepicker__month-select")));
	Select drpYear = new Select (driver.findElement(By.className("react-datepicker__year-select")));
	Select drpDay = new Select (driver.findElement(By.className("react-datepicker__week")));
	
	
	public Forms(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getFirstName() {
		return driver.findElement(By.id("firstName"));
	}
	public WebElement getLastName() {
		return driver.findElement(By.id("lastName"));
	}
	public WebElement getEmail() {
		return driver.findElement(By.id("userEmail"));
	}
	public WebElement getGenderMale() {
		return driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label"));
	}
	
	public WebElement getGenderFemale() {
		return driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label"));
	}

	public WebElement getGenderOther() {
		return  driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[3]/label"));
	}

	public WebElement getMobile() {
		return driver.findElement(By.id("userNumber"));
	}
	public WebElement getDateOfBirth() {
		return driver.findElement(By.cssSelector("#dateOfBirthInput"));
	}
	
	public WebElement getMonthPicker() {
		return driver.findElement(By.cssSelector("div.body-height:nth-child(2).div.container.playgound-body.div.row.div.col-12.mt-4.col-md-6:nth-child(2).div.practice-form-wrapper.div.mt-2.row:nth-child(5).div.col-md-9.col-sm-12.div.react-datepicker__tab-loop.div.react-datepicker-popper.div.react-datepicker.div.react-datepicker__month-container:nth-child(4).div.react-datepicker__header.div.react-datepicker__header__dropdown.react-datepicker__header__dropdown--select.div.react-datepicker__month-dropdown-container.react-datepicker__month-dropdown-container--select.>.select.react-datepicker__month-select"));
	}

	public WebElement getYearPicker() {
		return driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]"));
	}

	public WebElement getDayPicker() {
		return driver.findElement(By.cssSelector(".div.body-height:nth-child(2).div.container.playgound-body.div.row div.col-12.mt-4.col-md-6:nth-child(2).div.practice-form-wrapper.div.mt-2.row:nth-child(5).div.col-md-9.col-sm-12.div.react-datepicker__tab-loop.div.react-datepicker-popper.div.react-datepicker.div.react-datepicker__month-container:nth-child(4).div.react-datepicker__month.div.react-datepicker__week:nth-child(1).>.div.react-datepicker__day.react-datepicker__day--001.react-datepicker__day--weekend:nth-child(1)"));
	}
	public WebElement getSubjects() {
		return driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]"));
	}
	public WebElement getHobbiesSport() {
		return driver.findElement(By.cssSelector(".div.body-height:nth-child(2).div.container.playgound-body.div.row.div.col-12.mt-4.col-md-6:nth-child(2).div.practice-form-wrapper.form:nth-child(2).div.mt-2.row:nth-child(7).div.col-md-9.col-sm-12.div.custom-control.custom-checkbox.custom-control-inline:nth-child(1).>.label.custom-control-label"));
	}
	
	public WebElement getHobbiesReading() {
		return driver.findElement(By.id("hobbies-checkbox-2"));
	}

	public WebElement getHobbiesMusic() {
		return driver.findElement(By.cssSelector(".div.body-height:nth-child(2).div.container.playgound-body.div.row.div.col-12.mt-4.col-md-6:nth-child(2).div.practice-form-wrapper.form:nth-child(2).div.mt-2.row:nth-child(7).div.col-md-9.col-sm-12 div.custom-control.custom-checkbox.custom-control-inline:nth-child(3).>.label.custom-control-label"));
	}

	public WebElement getPicture() {
		return driver.findElement(By.id("uploadPicture"));
	}
	public WebElement getCurrentAddress() {
		return driver.findElement(By.cssSelector(".#currentAddress"));
	}
	public WebElement getState() {
		return driver.findElement(By.xpath("//div[contains(text(),'Uttar Pradesh')]"));
	}
	public WebElement getCity() {
		return driver.findElement(By.xpath("//div[contains(text(),'Select City')]"));
	}
	
	public WebElement getSubmitButton() {
		return driver.findElement(By.id("submit"));
	}
	public WebElement getSubmitedFormMsg() {
		return driver.findElement(By.cssSelector(".body.modal-open:nth-child(2).div.fade.modal.show:nth-child(9).div.modal-dialog.modal-lg.>.div.modal-content"));
	}
	// methods --------------------------------------
	public void clickMale() {
		this.getGenderMale().click();
	}
	public void clickFemale() {
		this.getGenderFemale().click();
	}
	public void clickOther() {
		this.getGenderOther().click();
	}
	
	public void ClickChooseImg() throws InterruptedException {
		this.getPicture().click();
		Thread.sleep(2000);
	}
	
	public void InputCurrentAddress() {
		this.getCurrentAddress().click();
		
	}
	public void clickSubmitButton() {
		this.getSubmitButton().click();
		
	}
	public void inputFirstname() {
		this.getFirstName().clear();
		this.getFirstName().sendKeys("Dunja");
		
	}
	public void inputLastname() {
		this.getLastName().clear();
		this.getLastName().sendKeys("Bozin");
	}
	public void inputEmail() {
		this.getEmail().clear();
		this.getEmail().sendKeys("cokajaksic@gmail.com");	
	}
	public void clickdateofBirth() {
		this.getDateOfBirth().click();
	}
	public void chooseMonth(String month) {
		this.drpMonth.selectByValue(month);
	}
	public void chooseYear(String year) {
		this.drpYear.selectByValue(year);
	}
	public void chooseDay(String day) {
		this.drpDay.selectByVisibleText(day);
	}
	public void InputSubjects() {
		this.getSubjects().clear();
		this.getSubjects().sendKeys("math");
	}
	//String subjectMatch; to choose matching subject with input
	
	public void chooseSports() {
		this.getHobbiesSport().click();
	}
	public void chooseReading() {
		this.getHobbiesReading().click();
	}
	public void chooseMusic() {
		this.getHobbiesMusic().click();
	}
	public void inputMobile() {
		this.getMobile().sendKeys("060987654");
	}
	public void chooseState() {
		this.getState().click();
		//choose 3rd
	}
	public void chooseCity() {
		this.getCity().click();
		//choose 3rd
	}
}
