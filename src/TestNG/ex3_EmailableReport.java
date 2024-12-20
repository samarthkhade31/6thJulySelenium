package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex3_EmailableReport 
{
	@Test
	public void TC1() 
	{
		Reporter.log("---running TC1---");
	}
	
	@Test
	public void TC2() 
	{
		Reporter.log("--running TC2--",false);
	}
	
	@Test
	public void TC3() 
	{
		Reporter.log("--running TC3--", true);
	}
}
