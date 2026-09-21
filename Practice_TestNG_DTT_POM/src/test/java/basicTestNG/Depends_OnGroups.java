package basicTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Depends_OnGroups {
	
	@Test(dependsOnGroups = {"testgroups"})
	public void test1() {
		
		System.out.println("Script from test 1");
	}
@Test(groups = {"testgroups"})
	public void test2() {
		System.out.println("Script from test 2");
	}
@Test
	public void test3() {
	Assert.assertTrue(false);
		System.out.println("Script from test 3");
	}
	
}
