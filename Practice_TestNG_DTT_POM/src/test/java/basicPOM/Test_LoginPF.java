package basicPOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_LoginPF {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.advantageonlineshopping.com/#/");
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		LoginPFpage lpf = new LoginPFpage(driver);

		wait.until(ExpectedConditions.elementToBeClickable(lpf.menuuser())).click();
		wait.until(ExpectedConditions.elementToBeClickable(lpf.username())).sendKeys("testuser1200");
		wait.until(ExpectedConditions.elementToBeClickable(lpf.password())).sendKeys("Random123");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(lpf.signin())).click();
		driver.quit();
	}

}
