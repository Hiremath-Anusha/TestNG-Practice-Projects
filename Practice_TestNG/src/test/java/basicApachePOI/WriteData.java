package basicApachePOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String expath = "D:\\Anusha\\Testdata\\Inventory-Records-Sample-Data.xlsx";

		// to write data
		FileInputStream fis = new FileInputStream(expath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		// Create row and write something
		wb.getSheet("sheet2").createRow(25).createCell(1).setCellValue("Post-Its");
		
		//To make changes to the existing cell (original value in B24 is Gaming Desk)
		wb.getSheet("sheet2").getRow(23).createCell(1).setCellValue("chalk");

		// To make permanent changes
		FileOutputStream fos = new FileOutputStream(expath);
		wb.write(fos);
		fos.close();

	}

}
