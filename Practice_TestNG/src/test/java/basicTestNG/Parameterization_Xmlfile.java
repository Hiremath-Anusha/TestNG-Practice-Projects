//input values are provided from an external source not from the code itself 
//In this code, the source is an xml file (Parameters_TestNG.xml)
package basicTestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameterization_Xmlfile {

	
	
	@Test
	@Parameters({"username", "password"})
	public void parameter(String username, String password) {
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test
	@Parameters({"username1", "password1"})
	public void parameter1(String username1, String password1) {
		System.out.println(username1);
		System.out.println(password1);
	}
	
	@Test
	@Parameters({"username2", "password2"})
	public void parameter2(String username2, String password2) {
		System.out.println(username2);
		System.out.println(password2);
	}
}
