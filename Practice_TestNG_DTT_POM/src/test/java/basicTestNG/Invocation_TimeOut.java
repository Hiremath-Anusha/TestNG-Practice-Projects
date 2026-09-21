//timeOut : MAximum number of milliseconds a a test should take

//timout is for individual test case and invocation timeout is an accumulated value

package basicTestNG;

import org.testng.annotations.Test;

public class Invocation_TimeOut {

	
@Test(invocationCount = 2, timeOut = 1000)	
public void test1() {
		
		System.out.println("Script from test1");
	}

}
