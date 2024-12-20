package POM_with_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabinvalidLoginTest 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		FileInputStream file = new FileInputStream("C:\\Testing\\Automation\\6thjuly2024.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		SwagLabLoginPage login = new SwagLabLoginPage(driver);
		login.inpSwagLabLoginPageUsername(sh.getRow(3).getCell(0).getStringCellValue());
		login.inpSwagLabLoginPagePassword(sh.getRow(3).getCell(1).getStringCellValue());
		login.clickSwagLabLoginPageLoginBtn();
		Thread.sleep(2000);
		
		login.verifySwagLabLoginPageErrorMsg(sh.getRow(3).getCell(2).getStringCellValue());
		Thread.sleep(2000);
		driver.quit();
		
	}
}
