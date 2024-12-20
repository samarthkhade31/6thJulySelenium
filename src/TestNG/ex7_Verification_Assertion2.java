package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ex7_Verification_Assertion2 
{
	@Test
	public void m2_assertNotEquals() 
	{
		String actResult = "xyz";
		String expResult = "xyz";
		Assert.assertNotEquals(actResult, expResult, "Failed: both result are same-");
	}
}
