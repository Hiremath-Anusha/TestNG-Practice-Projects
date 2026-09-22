package basicPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPFpage {

	WebDriver driver;

	public LoginPFpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// @FindBy=(att="value") Webelement name;

	@FindBy(id = "menuUser")
	WebElement Muser;
	@FindBy(name = "username") 
	WebElement Uname;
	@FindBy(name = "password")
	WebElement Pword;
	@FindBy(id = "sign_in_btn")
	WebElement Sin;

	public WebElement menuuser() {
		return Muser;
	}

	public WebElement username() {
		return Uname;
	}

	public WebElement password() {
		return Pword;
	}

	public WebElement signin() {
		return Sin;
	}

}
