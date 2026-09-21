package basicTestNG;

import org.testng.annotations.Test;

public class Invocation_Count {
	
	
	@Test(invocationCount = 3) //test runs 3 times
	public void test1() {
		
		System.out.println("Script from test1");
	}

}
