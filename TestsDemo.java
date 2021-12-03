package testPackage;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseDemo;
import pagesPackage.Forms;

public class TestsDemo extends BaseDemo{
	// Launch Website    
	@BeforeMethod
	public void pageSetUp() {
		driver.manage().window().maximize();
		driver.navigate().to(homeUrl);
		//Thread.sleep(2000);
	}
	@Test(priority = 10)
	public  void VerifyThatClickingTopHeaderReturnsUserToTheDemoQAHomepage() throws InterruptedException {
		
		homepage.clickElements();
		//wdwait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".body.modal-open:nth-child(2).div.modal.fade.show:nth-child(3).div.modal-dialog.>.div.modal-content")));
		Thread.sleep(5000);
		//verify "Elements" page appears 
		Assert.assertEquals(elementsPage.elementsPageNameText(), "Elements");
		// Go back to Home page clicking Top Header 
		homepage.clickTopHeader();
		// verify user is on the home page 
		Assert.assertTrue(homepage.getElements().isDisplayed());
		//--------------------------------------
		homepage.clickForms();
		Thread.sleep(5000);
		//verify "Forms" page appears 
		Assert.assertEquals(elementsPage.elementsPageNameText(), "Forms");
		// Go back to Home page clicking Top Header 
		homepage.clickTopHeader();
		// verify user is on the home page 
		Assert.assertTrue(homepage.getForms().isDisplayed());
		//--------------------------------------
		homepage.clickAlerts();
		Thread.sleep(5000);
		//verify "Alerts" page appears 
		Assert.assertEquals(elementsPage.elementsPageNameText(), "Alerts, Frame & Windows");
		// Go back to Home page clicking Top Header 
		homepage.clickTopHeader();
		// verify user is on the home page 
		Assert.assertTrue(homepage.getAlerts().isDisplayed());
		//--------------------------------------
		homepage.clickWidgets();
		Thread.sleep(5000);
		//verify "Widgets" page appears 
		Assert.assertEquals(elementsPage.elementsPageNameText(), "Widgets");
		// Go back to Home page clicking Top Header 
		homepage.clickTopHeader();
		// verify user is on the home page 
		Assert.assertTrue(homepage.getWidgets().isDisplayed());
		//--------------------------------------
		homepage.clickInteractions();
		Thread.sleep(5000);
		//verify "Interactions" page appears 
		Assert.assertEquals(elementsPage.elementsPageNameText(), "Interactions");
		// Go back to Home page clicking Top Header 
		homepage.clickTopHeader();
		// verify user is on the home page 
		Assert.assertTrue(homepage.getInteractions().isDisplayed());
		//--------------------------------------
		homepage.clickBookStore();
		Thread.sleep(5000);
		//verify "Book Store" page appears 
		Assert.assertEquals(elementsPage.elementsPageNameText(), "Book Store");
		// Go back to Home page clicking Top Header 
		homepage.clickTopHeader();
		// verify user is on the home page 
		Assert.assertTrue(homepage.getBookStore().isDisplayed());
		
	}
	
	@Test(priority = 20)
	public  void VerifyThatUserCanSubmitTextBoxWithValidCredentials() throws InterruptedException {
		// valid credentials
		String fullName = excelDemo.getStringData("sheetDemo", 1, 1); 
		String email = excelDemo.getStringData("sheetDemo", 1, 2);
		String currentAddress = excelDemo.getStringData("sheetDemo", 1, 3);
		String permanentAddress = excelDemo.getStringData("sheetDemo", 1, 4);

		homepage.clickElements();
		elementsPage.clickTextbox();
		textBoxPage.insertFullName(fullName);
		textBoxPage.insertEmail(email);
		textBoxPage.insertCurrentAddress(currentAddress);
		textBoxPage.insertPermanentAddress(permanentAddress);
		textBoxPage.clickSubmitButton();
		
		//check if current and permanent address are equals
			WebElement currentAddressT = driver.findElement(By.xpath("//*[@id=\"currentAddress\"]"));
			String currentAddressText = currentAddressT.getText();
				
			WebElement permanentAddressT = driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]"));
			String permanentAddressText = permanentAddressT.getText();
				
			if(currentAddressText.equals(permanentAddressText)) {
				System.out.println("Current address and permanent address are same");
			}else {
				System.out.println("Current address and permanent address differ");
			}
					
	}
	
	@Test(priority = 30)
	public  void VerifyThatUserCanCheckOnlyDesktopCheckBox() throws InterruptedException {
		homepage.clickElements();
		elementsPage.clickCheckbox();
		Thread.sleep(2000);
		checkBoxPage.clickExpandToOpenButton();
		checkBoxPage.clickDesktopBox();
		
		//verify "Desktop checkBox is marked" message is showed and correct
		String dobijeniText= checkBoxPage.getWhatIsSelectedMsg().getText();
		String ocekivaniTekst = "desktop\r\n" + 
				"notes\r\n" + 
				"commands";
		Assert.assertEquals(dobijeniText, ocekivaniTekst);
		//verify Desktop check box is marked and downloads and documents boxes are unmarked
		assertTrue(checkBoxPage.getDesktopMarked().isDisplayed()&& checkBoxPage.getDocumentsBox().isDisplayed() && checkBoxPage.getDowloadsBox().isDisplayed());
		
	}
	
	@Test(priority = 40)
	public  void VerifyThatUserCanSwitchCheckedRadioButtons() throws InterruptedException {
		//reach the Radio Button page
		homepage.clickElements();
		elementsPage.clickRadiobutton();
		Thread.sleep(2000);
		// --------------------------------------
		//mark "Yes" button
		radioButtonPage.clickYes();
		String dobijeniYesText= radioButtonPage.getRadioTextYesMsg().getText();
		String ocekivaniTekstYes = "You have selected Yes";
		// verify "yes" radio button is marked and message is correct 
		assertTrue(dobijeniYesText.equals(ocekivaniTekstYes)&& radioButtonPage.getYes().isEnabled());
		// --------------------------------------
		//mark "Impressive" button
		radioButtonPage.clickImpressive();
		// verify "impressive" radio button is marked and message is correct 
		String dobijeniImpressiveText= radioButtonPage.getRadioTextImpressiveMsg().getText();
		String ocekivaniTekstImpressive = "You have selected Impressive";
		assertTrue(dobijeniImpressiveText.equals(ocekivaniTekstImpressive)&& radioButtonPage.getImpressive().isEnabled());
		// --------------------------------------
		// mark "No"radio button 
		radioButtonPage.clickNo();
		// verify "No" radio button is marked and message is correct 
		String dobijeniNoButtonText= radioButtonPage.getRadioTextNoMsg().getText();
		String ocekivaniTekstNo = "You have selected No";
		assertTrue(dobijeniNoButtonText.equals(ocekivaniTekstNo)&& radioButtonPage.getNo().isEnabled());
		// "no"radio button is not clickable that's issue and test will fail
	}
	
	@Test(priority = 50)
	public  void VerifyThatUserCanSubmitStudentRegistrationFormWithValidCredentials() throws InterruptedException {
		String imagePath = "\"C:\\Users\\w10\\Downloads\\1631619900153.jpg\"";
		String currentAddressText = excelDemo.getStringData("sheetDemo", 1, 3);
		
		homepage.clickForms();
		homepage.getPracticeForm();
		Thread.sleep(2000);
		forms.inputFirstname();
		forms.inputLastname();
		forms.inputEmail();
		forms.clickFemale();
		forms.inputMobile();
		forms.clickdateofBirth();
		forms.chooseYear();
		forms.chooseMonth();
		forms.chooseDay();
		forms.
		forms.InputSubjects();
		forms.chooseSports();
		forms.ClickChooseImg();
		forms.getPicture().sendKeys(imagePath);
		forms.InputCurrentAddress();
		forms.getCurrentAddress().sendKeys(currentAddressText);
		forms.chooseState();
		forms.chooseCity();
		forms.clickSubmitButton();	
		
		//verify "thanks for submitting the form "header appears
		Assert.assertTrue(forms.getSubmitedFormMsg().isDisplayed());
		
	}
	
	@Test(priority = 60)
	public  void VerifyThatUserCanBrowseNewWindow() throws InterruptedException {
		homepage.clickAlerts();
		homepage.clickBrowserWindow();
		alertsWindowPage.clickNewWindow();
		Thread.sleep(2000);
		//verify new window shows
		//Assert.assertTrue(newWindow.isdispalyed);
	}
	@Test(priority = 70)
	public  void VerifyThatUserCanClickButtonToSeeAlert() throws InterruptedException {
		homepage.clickAlerts();
		homepage.clickSubAlerts();
		Thread.sleep(2000);
		alertsWindowPage.clickButtonToSeeAlert();
		//verify alert pop up is displayed
		//Assert.assertTrue(alertPopUp.isdispalyed);
	}
	@Test(priority = 80)
	public  void VerifySuccessLoginBookstoreWithValidCredentials() throws InterruptedException {
		//valid credentials
		String username = excelDemo.getStringData("sheetDemo", 1, 5); 
		String password = excelDemo.getStringData("sheetDemo", 1, 6);
		
		homepage.clickBookStore();
		homepage.clickLoginBookStore();
		Thread.sleep(2000);
		loginBeginBookStore.inputUserName();
		loginBeginBookStore.getFirstName().sendKeys(username);
		loginBeginBookStore.inputPassword();
		loginBeginBookStore.getPassword().sendKeys(password);
		loginBeginBookStore.clickLogin();
		//verify that user is successfully login
		String matchingUsername =  loginBeginBookStore.getUsernameName().getText();
		Assert.assertEquals(matchingUsername, username);
	}
	@Test(priority = 90)
	public  void VerifyThatUserCannotLoginBookstoreWithInvalidCredentials() throws InterruptedException {
		String InvalidUsername = excelDemo.getStringData("sheetDemo", 1, 7); 
		String InvalidPassword = excelDemo.getStringData("sheetDemo", 1, 8);
		
		homepage.clickBookStore();
		homepage.clickLoginBookStore();
		Thread.sleep(2000);
		loginBeginBookStore.inputUserName();
		loginBeginBookStore.getFirstName().sendKeys(InvalidUsername);
		loginBeginBookStore.inputPassword();
		loginBeginBookStore.getPassword().sendKeys(InvalidPassword);
		loginBeginBookStore.clickLogin();
		//verify that login failed and error msg appears 
		String invalidLoginMsgText = loginBeginBookStore.getInvalidLoginMsg().getText();
		Assert.assertEquals(invalidLoginMsgText, "Invalid username or password!");
		assertTrue(loginBeginBookStore.getLogin().isDisplayed());
	}
	@Test(priority = 100)
	public  void VerifyThatUserCanRegisterToBookstoreWithValidCredentials() throws InterruptedException {
		String ValidUsername = excelDemo.getStringData("sheetDemo", 1, 5); 
		String ValidPassword = excelDemo.getStringData("sheetDemo", 1, 6);
		String ValidFirstname = excelDemo.getStringData("sheetDemo", 1, 9);
		String ValidLastname = excelDemo.getStringData("sheetDemo", 1, 10);
		
		homepage.clickBookStore();
		homepage.clickLoginBookStore();
		loginBeginBookStore.clickNewUser();
		Thread.sleep(2000);
		loginBeginBookStore.inputFirstName();
		loginBeginBookStore.getFirstName().sendKeys(ValidFirstname);
		loginBeginBookStore.inputLastName();
		loginBeginBookStore.getLastName().sendKeys(ValidLastname);
		
		loginBeginBookStore.inputUserName();
		loginBeginBookStore.getUsername().sendKeys(ValidUsername);
		loginBeginBookStore.inputPassword();
		loginBeginBookStore.getPassword().sendKeys(ValidPassword);
		//verify "reCaptcha"
		loginBeginBookStore.clickRegister();
		//verify that user is registered and alert pop up is showed
		//String MsgText = loginBeginBookStore.getInvalidLoginMsg().getText();
		//Assert.assertEquals();
		
	}
	
	@AfterMethod
    public void deleteCookies() {
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
    }


}
