package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PSaam_SwagLabHomePage 
{
	//step 1: declaration
	@FindBy(xpath = "//div[@class='app_logo']") private WebElement logo;
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']") private WebElement openmenu;
	
	//step 2: initialization
	public PSaam_SwagLabHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//step 3: usage
	public void verifyPSaam_SwagLabHomePageLogo() 
	{
		String actLogotext = logo.getText();
		String expLogotext = "Swag Labs";
		if (actLogotext.equals(expLogotext)) 
		{
			System.out.println("TC Pass");
		} 
		else 
		{
			System.out.println("TC Fail");
		}
	}
	public void clickPSaam_SwagLabHomePageOpenMenu() 
	{
		openmenu.click();
	}
}
