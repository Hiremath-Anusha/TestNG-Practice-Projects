package basicApachePOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	
	public static void main (String[] args) throws IOException {

	
	String expath="D:\\Anusha\\Testdata\\Inventory-Records-Sample-Data.xlsx";
	
	
	//XLSX and XSSFWorkbook
	FileInputStream fis = new FileInputStream(expath);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	//get row 6 from sheet2 (0,1,2,3,4,5), column 2 [B6] 
	//data in the cell B6 is Power Supply
	
   String val1 =wb.getSheet("sheet2").getRow(5).getCell(1).getStringCellValue();
   int val2 = (int) wb.getSheet("sheet2").getRow(5).getCell(6).getNumericCellValue();
	System.out.println(val1);
	System.out.println(val2);
			
			
   }
}
