package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex4_getNumericDataAsAString
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Testing\\Automation\\6thjuly2024.xlsx\\");
		
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(2).getStringCellValue();
		
		System.out.println(value);
		
	}
}
