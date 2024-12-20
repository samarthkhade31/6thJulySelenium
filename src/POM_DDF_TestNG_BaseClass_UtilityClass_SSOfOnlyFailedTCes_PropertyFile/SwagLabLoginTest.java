package POM_DDF_TestNG_BaseClass_UtilityClass_SSOfOnlyFailedTCes_PropertyFile;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLabLoginTest extends BaseClass
{
	SwagLabLoginPage login;
	SwagLabHomePage home;
	SwagLabOpenMenuPage menu;
	int TCID;
	
	@BeforeClass
	public void openBrowser() throws IOException 
	{
		initializeBrowser();
		
		login = new SwagLabLoginPage(driver);
		home = new SwagLabHomePage(driver);
		menu = new SwagLabOpenMenuPage(driver);
		
	}
	
	@BeforeMethod
	public void loginToApp() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		login.inpSwagLabLoginPageUsername(UtilityClass.getPFData("UN"));
		login.inpSwagLabLoginPagePassword(UtilityClass.getPFData("PWD"));
		login.clickSwagLabLoginPageLoginBtn();
		Thread.sleep(2000);		
	}
	
	@Test
	public void verifyLogo() throws EncryptedDocumentException, IOException 
	{
		TCID=102;
		String actLogoText = home.getSwagLabHomePageLogoText();
		String expLogoText = UtilityClass.getPFData("expText");
		Assert.assertEquals(actLogoText, expLogoText, "Failed:- both result are diff: ");
	}
	
	@AfterMethod
	public void logoutFromApp(ITestResult s1) throws InterruptedException, IOException 
	{
		if(s1.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.captureSS(driver, TCID);
		}
		home.clickSwagLabHomePageOpenmenu();
		Thread.sleep(2000);
		menu.clickSwagLabOpenMenuPageLogoutBtn();
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
}
