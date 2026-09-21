package basicTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Para_DataProv_Ex {

	@Test(dataProvider = "mydataprovider")
	public void login(String username, String password) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.advantageonlineshopping.com/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		Thread.sleep(10000);

		// CLick on user icon
		driver.findElement(By.id("menuUser")).click();

		// Click on username
		driver.findElement(By.name("username")).sendKeys(username);

		// Click on password
		driver.findElement(By.name("password")).sendKeys(password);

		Thread.sleep(5000);
		// click on Sign in button
		driver.findElement(By.id("sign_in_btn")).click();

		Thread.sleep(5000);
		// Check if username appears on profile
		String actualuser = driver.findElement(By.xpath("//*[@id=\"menuUserLink\"]/span")).getText();

		if (actualuser.equals(username)) {
			System.out.println("Test is passed");
		} else {
			System.out.println("Test is failed");
		}
		driver.close();

	}

	// Create Data provider method
	@DataProvider(name = "mydataprovider")
	public Object[][] datamethod() {
		return new Object[][] { { "testuser1205", "Random123" }, { "testuser125", "Random123" },
				{ "testuser120", "Random123" } };

	}
}
