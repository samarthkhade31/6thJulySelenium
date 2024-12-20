package ImpQuestion;
import org.openqa.selenium.chrome.ChromeDriver;
public class ChromeOptions_Ex5_PrintBrowser_Name_version1
{
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		System.out.println(driver.getCapabilities().getBrowserName());
		System.out.println(driver.getCapabilities().getBrowserVersion());
	}
}
