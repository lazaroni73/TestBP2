package pfPack.pages;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.ExtentTest;

import pfPack.base.BasePage;
import pfPack.util.Constants;

public class HomePage extends BasePage{
	
	

	@FindBy(id="password")
	public WebElement passwordField;
	
	@FindBy(id = "nextbtn")
	public WebElement nextButton;

	
	HomePage(WebDriver driver, ExtentTest eTest){
		
		this.driver = driver;
		this.eTest = eTest;
		
	}
	
	public void passwordInput() {
		
		passwordField.sendKeys(Constants.PASSWORD);
		nextButton.click();
		
		String URL = driver.getCurrentUrl();	
		
	}
	

}
