package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PSaam_SwagLabOpenMenuPage 
{
	//step 1: declaration
	@FindBy(xpath = "//a[text()='Logout']") private WebElement logout;
	
	//step 2: initialization
	public PSaam_SwagLabOpenMenuPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//step 3: usage
	public void clickPSaam_SwagLabOpenMenuPageLogoutBtn() 
	{
		logout.click();
	}
}
