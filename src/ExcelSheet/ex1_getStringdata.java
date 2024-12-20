package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex1_getStringdata
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Testing\\Automation\\6thjuly2024.xlsx\\");
		
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(2).getStringCellValue();
		
		System.out.println(value);
		
		
//		Workbook book = WorkbookFactory.create(file);
//		
//		Sheet sh = book.getSheet("Sheet1");
//		Row rw = sh.getRow(1);
//		Cell cl = rw.getCell(2);
//		String value = cl.getStringCellValue();		
//		System.out.println(value);		
//		
		
	}

}
