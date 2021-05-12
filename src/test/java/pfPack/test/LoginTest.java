package pfPack.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pfPack.pages.LaunchPage;
import pfPack.pages.LoginPage;
import pfPack.test.base.BaseTest;
import pfPack.util.Constants;
import pfPack.util.ExtentManager;

public class LoginTest extends BaseTest {
	
	
	
	@Test
	public void testLogin() {
		
		eTest = report.startTest("testLogin");
		
		eTest.log(LogStatus.INFO, "Login test started ");
		
		openBrowser(Constants.BROWSER_TYPE);
		
		// Create object for LaunchPage and use the methods
		LaunchPage launchPage = new LaunchPage(driver,eTest);
		PageFactory.initElements(driver,launchPage);
		
		launchPage.goToLoginPage();
		
		// Create object for Login Page 
		

		
		
		
	}
	
	@AfterMethod	
	public void testCloser() {
		
		if(report!=null) {
			
			report.endTest(eTest);
			report.flush();
			
		}
		
		driver.quit();
	}

}
