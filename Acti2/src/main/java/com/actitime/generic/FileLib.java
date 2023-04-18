package com.actitime.generic;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * this is a generic class for data driven testing
 * @author satya
 *
 */
public class FileLib {
	/**
	 * this is a generic method for reading the data from the property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getPropertyData(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String data=p.getProperty(key);
		return data;
	}
	/**
	 * this is a generic method to get the data from the excel file
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getExcelData(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException  {
		FileInputStream fis=new FileInputStream("./data/testscripts.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return data;	
	}
/**
 * this is a generic method to write the data from the excel file
 * @param sheetName
 * @param row
 * @param cell
 * @param value
 * @throws EncryptedDocumentException
 * @throws IOException
 */
	public void setExcelData(String sheetName,int row,int cell,String value) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testscripts.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
	  wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(value);
	  FileOutputStream fos=new FileOutputStream("./data/testscripts.xlsx");
	  wb.write(fos);
	  wb.close();
		
	}
}

