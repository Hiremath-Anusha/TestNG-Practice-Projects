package basicTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_atBeforeAfterMETHOD {

	@Test(priority = 0)
	public void login() {
		System.out.println("Login Script");
	}

	@Test(priority = 1)
	public void inbox() {
		System.out.println("Inbox Script");
	}

	@Test(priority = 2)
	public void compose() {
		System.out.println("Compose Script");
	}

	@BeforeTest
	public void openbrowser() {
		System.out.println("Open browser script");
	}

	@AfterTest
	public void closebrowser() {
		System.out.println("Close broswer script");
	}

	@BeforeMethod // executed before each test cases
	public void beforemethod() {
		System.out.println("Before method");

	}
	@AfterMethod // executed after each test cases
	public void aftermethod() {
		System.out.println("After method");

	}

}
