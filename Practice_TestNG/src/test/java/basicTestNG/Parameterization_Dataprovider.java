package basicTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameterization_Dataprovider {

	
	/* @DataProvider(name = "dataprovider_name")
	 * 
	 * public Object[][]dataprovidermethod(){
	 * return new Object[][]{values};
	 * }
	 * 
	 */
	
	@DataProvider (name = "dataprovider")
	public Object[][] datamethod(){
	return new Object[][] {{"username","password"},{"username2", "password2"},{"username3","password3"}};
	}
	
	@Test(dataProvider = "dataprovider")
	public void test1(String val, String val2) {
		System.out.println(val);
		System.out.println(val2);
	}
}
