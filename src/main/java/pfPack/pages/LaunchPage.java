package pfPack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import pfPack.base.BasePage;
import pfPack.util.Constants;

public class LaunchPage extends BasePage{
	
	

	@FindBy(className="zh-customers")
	public WebElement Customers;
	
	@FindBy(className = "zh-support")
	public WebElement Support;
	
	
	@FindBy(className = "zh-login")	
	public WebElement Login;
	
	//Constructor 
	public LaunchPage(WebDriver driver, ExtentTest eTest) {
		
		this.driver = driver;
		this.eTest = eTest;
		
	}
	
	public void goToLoginPage() {
		
	driver.get(Constants.APP_URL);
	
	Login.click();
	
	LoginPage loginPage = new LoginPage(driver,eTest);
	PageFactory.initElements(driver,loginPage);
	
	loginPage.doLogin();
		
	}
	
	
}
