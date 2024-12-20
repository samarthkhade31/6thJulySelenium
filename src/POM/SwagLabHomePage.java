package POM;
//POM class2
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SwagLabHomePage
{
	//step 1: declaration
	@FindBy(xpath = "//div[@class='app_logo']") private WebElement logo;
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']") private WebElement openmenu;
	
	
	//step 2: initialization
	public SwagLabHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//step 3: usage
	public void verifyLogo() 
	{
		String acttext = logo.getText();
		String exptext = "Swag Labs";
		if (acttext.equals(exptext))
		{
			System.out.println("TC Pass");
		}
		else 
		{
			System.out.println("TC Fail");
		}
	}
	
	public void clickOnOpenMenu() 
	{
		openmenu.click();
	}
	
}
