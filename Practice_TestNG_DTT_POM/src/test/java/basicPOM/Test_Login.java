package basicPOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.advantageonlineshopping.com/#/");
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		// we have to call the method class from LoginPage (class name)
		// Create object

		LoginPage lp = new LoginPage(driver);
		
		//click user icon
		wait.until(ExpectedConditions.elementToBeClickable(lp.menuuser())).click();
		
		//enter username
		wait.until(ExpectedConditions.visibilityOf(lp.username())).sendKeys("testuser1200");
		
		//enter password
		wait.until(ExpectedConditions.visibilityOf(lp.password())).sendKeys("Random123");
		
		Thread.sleep(3000);
		//Click sign in
		wait.until(ExpectedConditions.elementToBeClickable(lp.signin())).click();

	}

}
