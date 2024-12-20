package TestNG;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class ex7_Verification_Assertion6 
{
	@Test
	public void m1_softAssert() 
	{
		SoftAssert soft = new SoftAssert();
		
		boolean actResult=false;
		soft.assertTrue(actResult, "Failed1: act result false-");
		
		String actResult1="xyz";
		String expResult1="abcd";
		soft.assertEquals(actResult1, expResult1, "Failed2: both results are diff-");			//className.methodName();
		
		soft.assertAll();
	}
}
