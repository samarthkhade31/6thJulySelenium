package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex1_getNumericdata 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{												
		FileInputStream file = new FileInputStream("C:\\Testing\\Automation\\6thjuly2024.xlsx\\");
		
		  double value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue();
		
		System.out.println(value);
		
	}
}
