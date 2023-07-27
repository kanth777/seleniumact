package Genericlib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Datautility {
	public String getdataFromProperties(String key) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\srika\\OneDrive\\Documents\\Selenium extract files\\Testdata.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String value=pobj.getProperty(key);
		System.out.println(value);
		return value;		
	}
	public String getdataFromExcelsheet(String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\srika\\OneDrive\\Documents\\Selenium extract files\\Book2.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(sheetname);
		DataFormatter format=new DataFormatter();
		String value=format.formatCellValue(sh.getRow(rownum).getCell(cellnum));
		return value;
		
	}}
	






