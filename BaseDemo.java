package basePackage;

import java.io.IOException;

import javax.lang.model.util.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pagesPackage.AlertsWindowPage;
import pagesPackage.CheckBox;
import pagesPackage.CheckBoxPage;
import pagesPackage.ElementsPage;
import pagesPackage.Forms;
import pagesPackage.Homepage;
import pagesPackage.LoginBeginBookStore;
import pagesPackage.RadioButtonPage;
import pagesPackage.TextBoxPage;


public class BaseDemo {
	public static WebDriver driver;
	public ExcelDemo excelDemo;
	public String homeUrl;
	public Homepage homepage;
	public ElementsPage elementsPage;
	public TextBoxPage textBoxPage;
	public CheckBoxPage checkBoxPage;
	public RadioButtonPage radioButtonPage;
	public Forms forms;
	public AlertsWindowPage alertsWindowPage;
	public LoginBeginBookStore loginBeginBookStore;
	public static WebDriverWait wdwait;
	//String var for excel file path 
	//public String excelPath =  "C:\\Users\\w10\\Desktop\\excelDemo.xlsx";
	public void scrollIntoView(WebElement element) {
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	@BeforeClass
	public void setUp() throws IOException {
		System.setProperty("webdriver.chrome.driver","driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
	    homepage = new Homepage(driver);
	    elementsPage = new ElementsPage(driver);
	    textBoxPage = new TextBoxPage(driver);
	    checkBoxPage = new CheckBoxPage(driver);
	    radioButtonPage = new RadioButtonPage(driver);
	    forms = new Forms(driver);
	    alertsWindowPage = new AlertsWindowPage(driver);
	    loginBeginBookStore = new LoginBeginBookStore(driver);
	   // excelDemo = new ExcelDemo(excelPath);
	    excelDemo = new ExcelDemo("C:\\Users\\w10\\Desktop\\excelDemo.xlsx");
	    homeUrl = excelDemo.getStringData("sheetDemo", 1, 0);
	    wdwait = new WebDriverWait(driver, 20);
	    
	}
	@AfterClass
	public void tearDown() {
	    driver.close();
	    driver.quit();
	}
	
}
