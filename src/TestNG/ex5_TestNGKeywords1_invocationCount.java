package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex5_TestNGKeywords1_invocationCount 
{
	@Test(invocationCount = 2)
	public void verifylogo1() 
	{
		Reporter.log("---running verify logo1 TC--", true);
	}
}
