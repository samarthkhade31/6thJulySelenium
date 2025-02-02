package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex10_grouping1 
{
	
	@Test(groups= {"Login"})
	public void TC1() 
	{
		Reporter.log("--runnning TC1--", true);
	}
	
	@Test(groups= {"Login"})
	public void TC2() 
	{
		Reporter.log("--running TC2", true);
	}
	
	@Test(groups= {"Payment"})
	public void TC3() 
	{
		Reporter.log("--running TC3--", true);
	}
	
	@Test(groups= {"Payment"})
	public void TC4() 
	{
		Reporter.log("--running TC4--", true);
	}
	
	@Test(groups= {"Profile"})
	public void TC5() 
	{
		Reporter.log("--running TC5--", true);
	}
}
