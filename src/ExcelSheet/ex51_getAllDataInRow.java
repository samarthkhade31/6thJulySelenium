package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex51_getAllDataInRow
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Testing\\Automation\\6thjuly2024.xlsx\\");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		
		int lastCollIndex = sh.getRow(1).getLastCellNum()-1;
		
		for(int i=0; i<=lastCollIndex; i++)
		{
			Cell cl = sh.getRow(1).getCell(i);
			CellType type = cl.getCellType();
			
			if(type==CellType.STRING)
			{
				String value = cl.getStringCellValue();
				System.out.print(value+" ");
			}
			
			else if(type==CellType.NUMERIC)
			{
				double value = cl.getNumericCellValue();
				System.out.print(value+" ");
			}
			
			else if(type==CellType.BOOLEAN)
			{
				boolean value = cl.getBooleanCellValue();
				System.out.print(value+" ");
			}
		}
	}
}
