package basicApachePOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String expath = "D:\\Anusha\\Testdata\\Inventory-Records-Sample-Data.xlsx";

		FileInputStream fis = new FileInputStream(expath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		int Rcount = wb.getSheet("sheet3").getLastRowNum();
		System.out.println("Total Rows: " + Rcount);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// i=0 is column name so ignored
		for (int i = 1; i <= Rcount; i++) {

			// Reading data from excel sheet
			String username = wb.getSheet("sheet3").getRow(i).getCell(0).getStringCellValue();
			String password = wb.getSheet("sheet3").getRow(i).getCell(1).getStringCellValue();

			System.out.println("Testing username: " + username);

			// Open SauceDemo
			driver.get("https://www.saucedemo.com/");

			driver.findElement(By.id("user-name")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.id("login-button")).click();
			
			
			
			try {
			    Alert alert = driver.switchTo().alert();
			    System.out.println(alert.getText());
			    alert.accept();
			} catch (NoAlertPresentException e) {
			    // No alert
			}
		
			List<WebElement> pass = driver.findElements(By.id("inventory_container"));

			if (pass.size()>0) {
				System.out.println("Login Successful");
				// Write this status into excel sheet
				wb.getSheet("sheet3").getRow(i).createCell(2).setCellValue("Valid data");

			} else {
				System.out.println("Login Failed");
				wb.getSheet("sheet3").getRow(i).createCell(2).setCellValue("Invalid data");
			}

			// Save Excel after all the testcases
			FileOutputStream fos = new FileOutputStream(expath);
			wb.write(fos);
			fos.close();
			

		}
		driver.quit();
		wb.close();
		fis.close();
	}

}
