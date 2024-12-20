package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.pdfbox.io.RandomAccessBufferedFileInputStream;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex1_getBooleandata 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{												
		FileInputStream file = new FileInputStream("C:\\Testing\\Automation\\6thjuly2024.xlsx\\");
		
		boolean value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(4).getCell(1).getBooleanCellValue();
		
		System.out.println(value);
	}
}
