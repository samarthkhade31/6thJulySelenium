package POM;
//POM class1
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage 
{
	//step 1: declaration
	@FindBy(xpath = "//input[@id='user-name']") private WebElement UN;		//private WebElement
	
	@FindBy(xpath = "//input[@id='password']") private WebElement PWD;		//private WebElement
	
	@FindBy(xpath = "//input[@id='login-button']") private WebElement LoginBtn;		//private WebElement
	
	//step 2: initialization
	public SwagLabLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);			//className.methodName(WebDriverObject, this);
	}
	
	//step 3: usage
	public void enterUserName()
	{
		UN.sendKeys("standard_user");
	}
	
	public void enterPassword() 
	{
		PWD.sendKeys("secret_sauce");
	}
	
	public void clickOnLogin() 
	{
		LoginBtn.click();
	}
}
