package pfPack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import pfPack.base.BasePage;
import pfPack.util.Constants;

public class LoginPage extends BasePage {

	

	@FindBy(id="login_id")
	public WebElement emailFiled;
	
	@FindBy(id = "nextbtn")
	public WebElement nextButton;
	//Constructor
	public LoginPage(WebDriver driver, ExtentTest eTest) {
		
		this.driver = driver;
		this.eTest = eTest;
		
	}

	public void doLogin() {
	emailFiled.sendKeys(Constants.USER_NAME);
	nextButton.click();
	
	HomePage hPage = new HomePage(driver, eTest);
	
	PageFactory.initElements(driver, hPage);
	hPage.passwordInput();
}
	
		
}

