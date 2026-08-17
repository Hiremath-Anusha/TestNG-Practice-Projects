package basicTestNG;



import org.testng.annotations.Test;



public class Annotations_atTest {



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





}

