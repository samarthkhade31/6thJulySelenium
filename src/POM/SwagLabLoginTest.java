package POM;
import java.time.Duration; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabLoginTest 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		SwagLabLoginPage login = new SwagLabLoginPage(driver);
		login.enterUserName();
		login.enterPassword();
		login.clickOnLogin();
		Thread.sleep(2000);
		
		SwagLabHomePage home = new SwagLabHomePage(driver);
		home.verifyLogo();
		Thread.sleep(2000);
		home.clickOnOpenMenu();
		Thread.sleep(2000);
		
		SwagLabOpenMenuPage menu = new SwagLabOpenMenuPage(driver);
		menu.clickOnLogout();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
