package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ex7_Verification_Assertion 
{
	@Test
	public void m1_assertEquals() 
	{
		String actResult = "xyz";
		String expResult = "abcd";
		Assert.assertEquals(actResult, expResult,"Failed: both result are diff-"); 			//className.methodName();
	}
}
