package basicPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
	//Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//User Icon
	//syntax public void menuuser()
	public WebElement menuuser() {
		
		return driver.findElement(By.id("menuUser"));
	}
	
	//select username field
	
	public WebElement username() {
		return driver.findElement(By.name("username"));
	}
	
	// password
	
	public WebElement password() {
		return driver.findElement(By.name("password"));
	}
	
	//Sign in button
	
	public WebElement signin() {
		return driver.findElement(By.id("sign_in_btn"));
	}

}
