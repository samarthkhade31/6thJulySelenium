package ActionClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex7_ScrollToElement
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	
		Thread.sleep(3000);

		Actions act = new Actions(driver);
		
		//scroll down -> 1st parameter 0, 2nd parameter +ve
		act.scrollByAmount(0, 300).perform();
		
		Thread.sleep(3000);
		
		//scroll up -> 1st parameter 0, 2nd parameter -ve
		act.scrollByAmount(0, -300).perform();
		
		
//		//scroll right -> 1st parameter +ve, 2nd parameter 0
//		act.scrollByAmount(300, 0).perform();
//		
//		//scroll left -> 1st parameter -ve, 2nd parameter 0
//		act.scrollByAmount(-200, 0).perform();
		
	}

}
