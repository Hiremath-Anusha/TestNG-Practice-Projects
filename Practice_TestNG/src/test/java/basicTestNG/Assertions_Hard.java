package basicTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions_Hard {

	//Assertion works only in Test method
	
	@Test
	public void test1() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zoom.us/");
		String acttitle = driver.getTitle();
		String exptitle = "One platform to connect | Zoom"; // Pass
		//String exptitle = "One platform to connect"; //Fail
		
		
		//assertion script will not work if the test is failed
		Assert.assertEquals(acttitle, exptitle);
		System.out.println("script after assertion");
		
		
		
	}
	
	
	
	
	
	
	
	
}
