/*this example is used as reference to show TestNG .XML 
example for grouping testcases*/

package basicTestNG;

import org.testng.annotations.Test;

public class Testcase_Grouping {
	
	
	@Test(groups = {"inbox"} )//group name inbox
	public void test1() {
		
		System.out.println("Inbox script");
	}
	
	@Test(groups = {"inbox"} )
	public void test2() {
		
		System.out.println("Inbox script");
	}
	@Test(groups = {"inbox"} )
	public void test3() {
		
		System.out.println("Inbox script");
	}	
		
	@Test(groups = {"delete"} )
	public void test4() {
		System.out.println("Delete script");
			
	}
	
	@Test(groups = {"delete"} )
	public void test5() {
		System.out.println("Delete script");
	}
	
	@Test(groups = {"compose"} )
	public void test6() {
		System.out.println("Compose script");
}
}
