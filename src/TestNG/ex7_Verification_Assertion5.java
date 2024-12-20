package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ex7_Verification_Assertion5 
{
	@Test
	public void limitationOfAssertClass() 
	{
		boolean actResult = false;
		Assert.assertTrue(actResult, "Failed1: act result false-");
		
		String actResult1="xyz";
		String expResult1="abcd";
		Assert.assertEquals(actResult1, expResult1, "Failed2: both result are diff-"); 					//className.methodName()=
	}
	
}
