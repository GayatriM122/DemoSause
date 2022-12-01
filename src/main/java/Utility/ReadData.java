package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData 
{
	 public static String readReadPropertyFile(String value) throws IOException
	    {
	    	Properties prop = new Properties();
	    	FileInputStream File = new FileInputStream("C:\\Users\\NILESH\\eclipse-workspace\\Frame25JuneA\\TestData\\config.property");
	    	prop.load(File);
	    	return prop.getProperty(value);
	    }
	    
	    public static String  ReadExcelFile(int rowNum,int colNum)
	    {
	    	FileInputStream File= new FileInputStream("");
	    	Sheet excel= WorkbookFactory.create(File).getSheet("");
	    	excel.getRow(rowNum).getCell(colNum).getStringCellValue();
	    	return value;
	    }
	   
}
