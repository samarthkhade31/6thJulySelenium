package Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_ExampleWithDDF 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		FileInputStream file = new FileInputStream("C:\\Testing\\Automation\\6thjuly2024.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//enter UN
		String UN = sh.getRow(2).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(UN);
		
		//enter pwd
		String PWD = sh.getRow(2).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PWD);
		
		//click on login btn
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		//get title
		@Nullable
		String acttitle = driver.getTitle();
		String exptitle = sh.getRow(2).getCell(2).getStringCellValue();
		
		if (acttitle.equals(exptitle))
		{
			System.out.println("TC Pass");
		} 
		else 
		{
			System.out.println("TC Fail");
		}
		Thread.sleep(3000);
		driver.quit();
	}
	
}
