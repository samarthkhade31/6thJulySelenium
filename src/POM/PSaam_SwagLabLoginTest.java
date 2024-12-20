package POM;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class PSaam_SwagLabLoginTest 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		PSaam_SwagLabLoginPage login = new PSaam_SwagLabLoginPage(driver);
		login.inpSwagLabLoginPageUsername();
		login.inpSwagLabLoginPagepassword();
		login.clickSwagLabLoginPageLoginBtn();
		Thread.sleep(3000);
		
		PSaam_SwagLabHomePage home = new PSaam_SwagLabHomePage(driver);
		home.verifyPSaam_SwagLabHomePageLogo();
		Thread.sleep(2000);
		home.clickPSaam_SwagLabHomePageOpenMenu();
		Thread.sleep(2000);
		
		PSaam_SwagLabOpenMenuPage menu = new PSaam_SwagLabOpenMenuPage(driver);
		menu.clickPSaam_SwagLabOpenMenuPageLogoutBtn();
		
		Thread.sleep(3000);
		driver.quit();
	}
	
}
