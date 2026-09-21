/*Open Advantageonlineshopping, Get title
 * open browser
 * enter url
 * get title
 * print
 * close
 * 
 * Repeat the steps for Easemytrip website
 */

package basicTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Selenium_Example {

	static WebDriver driver; // driver can be used in all methods

	@BeforeTest
	public void teststart() {
		System.out.println("**** TEST STARTED ****");
	}

	@BeforeMethod
	public void openbrowser() {
		driver = new ChromeDriver();
	}

	@Test
	public void advantage() {

		driver.get("https://www.advantageonlineshopping.com/#/");
		String advntitle = driver.getTitle();
		System.out.println(advntitle);
	}

	@Test
	public void easemytrip() {
		driver.get("https://www.easemytrip.com");
		String triptitle = driver.getTitle();
		System.out.println(triptitle);
	}

	@AfterMethod
	public void closebrowser() {
		driver.close();

	}

	@AfterTest
	public void testends() {
		System.out.println("**** TEST ENDS ****");

	}
}
