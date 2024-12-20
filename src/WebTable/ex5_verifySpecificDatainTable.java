package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex5_verifySpecificDatainTable
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Testing/HTML/Sample5WebTable.html");
		
		String expText="java";
		String actText ="";
		boolean eleFound=false;
		
		int rowSize = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
		
		for(int i=1; i<=rowSize; i++)
		{
			int colSize=0;
			if(i==1)
			{
				colSize = driver.findElements(By.xpath("//table[@id='1234']//tr["+i+"]/th")).size();
			}
			else
			{
				colSize = driver.findElements(By.xpath("//table[@id='1234']//tr["+i+"]/td")).size();
			}
			
			for(int j=1; j<=colSize; j++) 
			{
				if(i==1)
				{
					actText = driver.findElement(By.xpath("//table[@id='1234']//tr["+i+"]/th["+j+"]")).getText();
				}
				else
				{
					actText = driver.findElement(By.xpath("//table[@id='1234']//tr["+i+"]/td["+j+"]")).getText();
				}
				if(actText.equals(expText))
				{
					eleFound=true;
					break;
				}
			}
			System.out.println();
		}
		if(eleFound)
		{
			System.out.println(expText+": is available in table");
		}
		else
		{
			System.out.println(expText+": is not available in table");
		}
	}
}
