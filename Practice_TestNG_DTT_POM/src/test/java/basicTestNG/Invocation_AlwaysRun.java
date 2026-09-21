package basicTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Invocation_AlwaysRun {
	
	@Test (alwaysRun = true ,dependsOnMethods = "test2")//test 2 executed first and then test1
	public void test1() {
		
		System.out.println("Script from test1");
	}
	
	@Test
	public void test2 () {
		
		Assert.assertTrue(false);// Purposely failing test2
		
		//if test2 fails, test1 wont execute.
		//use alwaysrun to execute test1 even if test2 fails
		
		System.out.println("Script from test2");
	}

}
