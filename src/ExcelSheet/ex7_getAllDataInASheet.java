package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex7_getAllDataInASheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Testing\\Automation\\6thjuly2024.xlsx\\");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		int lastRowindex = sh.getLastRowNum();
		
		for(int i=0; i<=lastRowindex; i++)				//outerr for loop -> rows
		{
			int lastCellIndex = sh.getRow(i).getLastCellNum()-1;
			
			for(int j=0; j<=lastCellIndex; j++)				//inner for loop > cols
			{
				String value = sh.getRow(i).getCell(j).getStringCellValue();
				
				System.out.print(value+" ");
			}
			
			System.out.println();
		}
		
		
	}
}
