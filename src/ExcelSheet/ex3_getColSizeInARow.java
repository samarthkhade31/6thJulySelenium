package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex3_getColSizeInARow 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Testing\\Automation\\6thjuly2024.xlsx\\");
		
		int colsize = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getLastCellNum();
	
		System.out.println(colsize);
	}
}
