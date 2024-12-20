package TestNG;


import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class ex7_Verification_Assertion3 
{
	public void m3_assertTrue() 
	{
		boolean actResult= false;
		Assert.assertTrue(actResult, "Failed: act result is false-");
	}
}
