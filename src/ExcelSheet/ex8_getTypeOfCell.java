package ExcelSheet;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ex8_getTypeOfCell 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException   
	{
		FileInputStream file = new FileInputStream("C:\\Testing\\Automation\\6thjuly2024.xlsx\\");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		
//		CellType type = sh.getRow(2).getCell(1).getCellType();
//		System.out.println(type);
		
		Cell s1 = sh.getRow(0).getCell(0);
		CellType type = s1.getCellType();
		System.out.println(type);
		
	}
}
