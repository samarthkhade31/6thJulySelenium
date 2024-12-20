package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex61_getAllDataInCol 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Testing\\Automation\\6thjuly2024.xlsx\\");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		
		int lastRowIndex = sh.getLastRowNum();
		
		for(int i=0; i<=lastRowIndex; i++)
		{
			Cell cl = sh.getRow(i).getCell(0);
			CellType type = cl.getCellType();
			
			if(type==CellType.STRING)
			{
				System.out.println(cl.getStringCellValue());
			}
			
			else if(type==CellType.NUMERIC)
			{
				System.out.println(cl.getNumericCellValue());
			}
			else if(type==CellType.BOOLEAN)
			{
				System.out.println(cl.getBooleanCellValue());
			}
		}
		
	}
}
