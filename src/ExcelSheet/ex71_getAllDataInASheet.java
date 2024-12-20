package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex71_getAllDataInASheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Testing\\Automation\\6thjuly2024.xlsx\\");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		
		int lastRowIndex = sh.getLastRowNum();
		
		for(int i=0; i<=lastRowIndex; i++)				//outer for loop -> rows
		{
			int lastCellIndex = sh.getRow(i).getLastCellNum()-1;
			
			for(int j=0; j<=lastCellIndex; j++)
			{
				Cell cl = sh.getRow(i).getCell(j);
				CellType type = cl.getCellType();
				
				if(type==CellType.STRING)
				{
					System.out.print(cl.getStringCellValue()+" ");
				}
				
				else if(type==CellType.NUMERIC)
				{
					System.out.print(cl.getNumericCellValue()+" ");
				}
				
				else if(type==CellType.BOOLEAN)
				{
					System.out.print(cl.getBooleanCellValue()+" ");
				}
			}
			System.out.println();
		}
	}
}
