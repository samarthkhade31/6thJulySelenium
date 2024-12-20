package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PSaam_SwagLabLoginPage 
{
	//step 1: declaration
	@FindBy(xpath = "//input[@id='user-name']") private WebElement UN;			//private WebElement
	@FindBy(xpath = "//input[@id='password']") private WebElement PWD;
	@FindBy(xpath = "//input[@id='login-button']") private WebElement loginBtn;
	
	//step 2: initialization
	public PSaam_SwagLabLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//step 3: usage
	public void inpSwagLabLoginPageUsername() 
	{
		UN.sendKeys("standard_user");
	}
	
	public void inpSwagLabLoginPagepassword() 
	{
		PWD.sendKeys("secret_sauce");
	}
	
	public void clickSwagLabLoginPageLoginBtn()
	{
		loginBtn.click();
	}
	
}
