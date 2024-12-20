package PSaam;

import org.openqa.selenium.By; 
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex1_Set_DOB_facebook 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		//step1 click on date
		WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
		Actions actd = new Actions(driver);
		actd.click(date).perform();
		
//		//set DOB by using END key directly
//		act.sendKeys(Keys.END).perform();
		
//		//set DOB by using for loop from current option
//		for(int i=1; i<=4; i++)
//		{
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(500);
//		}
		
		//set DOB by using HOME key & for loop also
		actd.sendKeys(Keys.HOME).perform();
		for(int i=1; i<=30; i++)
		{		
			actd.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(200);
		}
		actd.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		//step2 click on month
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Actions actm = new Actions(driver);
		actm.click(month).perform();
		
//		//set month using for loop from current option (ARROW_UP)  
//		for(int i=1; i<=7; i++)
//		{
//			actm.sendKeys(Keys.ARROW_UP).perform();
//			Thread.sleep(200);
//		}
		
		//set month using HOME key & for loop 
		actm.sendKeys(Keys.HOME).perform();
		for(int i=1; i<=2; i++)
		{
			actm.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(300);
		}
		
		actm.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		//step3 click on year
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Actions acty = new Actions(driver);
		acty.click(year);
		
//		//set year using for loop from current option 
//		for(int i=1; i<=22; i++) 
//		{		
//			acty.sendKeys(Keys.ARROW_DOWN).perform();
//			Thread.sleep(200);
//		}
		
		//set year using HOME key & for loop
//		acty.sendKeys(Keys.HOME).perform();
//		for(int i=1; i<=22; i++)
//		{
//			acty.sendKeys(Keys.ARROW_DOWN).perform();
//			Thread.sleep(200);
//		}
		
		//set year using END key & for loop 
		acty.sendKeys(Keys.END).perform();
		for(int i=1; i<=97; i++)
		{
			acty.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(50);
		}
		acty.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(3000);
		driver.quit();
			
	}
	
}
