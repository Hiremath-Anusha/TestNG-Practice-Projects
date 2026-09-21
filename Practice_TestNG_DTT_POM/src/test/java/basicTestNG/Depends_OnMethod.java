package basicTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Depends_OnMethod {
	
	@Test(dependsOnMethods = {"test3","test2"})// test1 is executed only after passing test 2 and 3
	public void test1() {
		
		System.out.println("Script from test 1");
	}
@Test
	public void test2() {
		System.out.println("Script from test 2");
	}
@Test
	public void test3() {
	Assert.assertTrue(false);
		System.out.println("Script from test 3");
	}
	
}
