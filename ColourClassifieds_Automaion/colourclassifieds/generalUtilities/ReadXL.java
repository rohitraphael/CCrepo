package generalUtilities;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class ReadXL 
{


	FileInputStream myFile;
	Workbook myBook;
	Sheet mySheet;
	String filePath;
	
	
	public ReadXL(String filePath)
	{
		this.filePath = filePath;
	}
	
	public Sheet getMySheet(String sheetName)
	{
		try {
			myFile=new FileInputStream(filePath);
			myBook=Workbook.getWorkbook(myFile);
			} 
		catch (Exception e) 
			{
			e.printStackTrace();
			}
		
		return myBook.getSheet(sheetName);
	}
	
	
	public int getRowCount(String sheetName)
	{
		mySheet =getMySheet(sheetName);
		return mySheet.getRows();
	}
	
	
	public int getColumnCount(String sheetName)
	{
		mySheet = getMySheet(sheetName);
		return mySheet.getColumns();
		
	}
	
	
	public String getCellData(String sheetName,int colNum,int rowNum)
	{
		mySheet = getMySheet(sheetName);
	
		return mySheet.getCell(colNum, rowNum).getContents();
	}
}
