package basicTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Reporter_Example {

	
	@Test(dataProvider = "newdataprovider")
	public void login(String username, String password) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		Reporter.log("Browser Opened");
		
		driver.get("https://www.advantageonlineshopping.com/#/");
		Reporter.log("URL launched");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		Reporter.log("Browser window maximized");
		
		Thread.sleep(10000);

		// CLick on user icon
		driver.findElement(By.id("menuUser")).click();
		Reporter.log("Clicked on user icon");
		
		// Click on username
		driver.findElement(By.name("username")).sendKeys(username);
		Reporter.log("Clicked on username");
		
		// Click on password
		driver.findElement(By.name("password")).sendKeys(password);
		Reporter.log("Clicked on password");

		Thread.sleep(5000);
		// click on Sign in button
		driver.findElement(By.id("sign_in_btn")).click();
		Reporter.log("Clicked on Sign-in button");

		Thread.sleep(5000);
		// Check if username appears on profile
		String actualuser = driver.findElement(By.xpath("//*[@id=\"menuUserLink\"]/span")).getText();
		Reporter.log("Read the title");
		
		if (actualuser.equals(username)) {
			System.out.println("Test is passed");
			Reporter.log("Successful login");
			
		} else {
			System.out.println("Test is failed");
			Reporter.log("Login failed");
		}
		driver.close();

	}

	// Create Data provider method
	@DataProvider(name = "newdataprovider")
	public Object[][] datamethod() {
		return new Object[][] { { "testuser1205", "Random123" }, { "testuser125", "Random123" },
				{ "testuser120", "Random123" } };

	}
	
}
