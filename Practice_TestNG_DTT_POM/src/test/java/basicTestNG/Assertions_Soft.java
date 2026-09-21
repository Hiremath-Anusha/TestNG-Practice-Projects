package basicTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions_Soft {

	//Assertion works only in Test method
	
	@Test
	public void test1() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zoom.us/");
		String acttitle = driver.getTitle();
		String exptitle = "One platform to connect | Zoom"; // Pass
		//String exptitle = "One platform to connect"; // Fail
		
		
		
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(acttitle, exptitle);		
		System.out.println("script after assertion");
		System.out.println("script after assertion");
		System.out.println("script after assertion");
		System.out.println("script after assertion");
		
		//write this at the end
		sa.assertAll(); //generates report 
	}
		
		@Test
		public void test2() {
			System.out.println("script from test 2");
		}
		
		
	}