package POM_DDF_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLabLoginTest 
{
	int a; 		//declare globally
	SwagLabLoginPage login;
	SwagLabHomePage home;
	SwagLabOpenMenuPage menu;
	Sheet sh;
	WebDriver driver;
	
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Testing\\Automation\\6thjuly2024.xlsx");
		sh = WorkbookFactory.create(file).getSheet("DDF");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		login = new SwagLabLoginPage(driver);
		home = new SwagLabHomePage(driver);
		menu = new SwagLabOpenMenuPage(driver);
		a=10; 		//initialize locally
	}
	
	@BeforeMethod
	public void loginToApp() throws InterruptedException 
	{
		login.inpSwagLabLoginPageUsername(sh.getRow(2).getCell(0).getStringCellValue());
		login.inpSwagLabLoginPagePassword(sh.getRow(2).getCell(1).getStringCellValue());
		login.clickSwagLabLoginPageLoginBtn();
		Thread.sleep(2000);
	}
	
	@Test
	public void verifyLogo()
	{
		//home.verifySwagLabHomePageLogo(sh.getRow(2).getCell(2).getStringCellValue());
		String actLogoText = home.getSwagLabHomePageLogoText();
		String expText = sh.getRow(2).getCell(2).getStringCellValue();
		Assert.assertEquals(actLogoText, expText,"Failed: both results are diff");
	}
	
	@AfterMethod
	public void logoutFromApp() throws InterruptedException 
	{
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
