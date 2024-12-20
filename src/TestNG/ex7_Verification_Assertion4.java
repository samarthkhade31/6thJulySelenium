package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ex7_Verification_Assertion4 
{
	@Test
	public void m4_assertFalse() 
	{
		boolean actResult = true;
		Assert.assertFalse(actResult, "failed: act result true-");
	}
}
