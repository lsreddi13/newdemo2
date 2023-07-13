package com.testng.selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoDataProvider {
	
	public static  Object[][] getTestData() throws  IOException {
//		public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(".\\testdataFiles\\data2.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("CrateUserUser");

		System.out.println("last row noumber (row count) : " + sheet.getLastRowNum());

		System.out.println("last column number ( Column Count ) : " + sheet.getRow(0).getLastCellNum());

		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

		for (int i = 0; i < sheet.getLastRowNum(); i++) { // iterate till last row.

			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) { // iterate till last column
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
			}
		}
//		for (Object[] objects : data) {
//			System.out.println(Arrays.toString(objects));
//		}
		return data;
	}
	
	
	
	@DataProvider(name = "xlsfiledata")
	public static Object[][] createData() throws IOException {
		return getTestData();
	}
	
	
	@Test(dataProvider = "xlsfiledata")
	public void cccccc1(String a, String b, String c, String d, String e, String f, String g) {
		System.out.println("a value : " + a);
		System.out.println("b value : " + b);
		System.out.println("c value : " + c);
		System.out.println("d value : " + d);
		System.out.println("e value : " + e);
		System.out.println("f value : " + f);
		System.out.println("g value : " + g);
	}
	
	

	@Test(enabled = false, dataProvider =  "dbData", dataProviderClass = DemoDataProvider2.class)
	public void test1(String a, String b, int c) {
		System.out.println("a value : " + a);
		System.out.println("b value : " + b);
		System.out.println("c value : " + c);		
	}

	@Test(dataProvider = "create", dataProviderClass = DemoDataProvider2.class, enabled = false)
	public void test2(String a1, String b1, int c1, int d1) {
		System.out.println("a1 value : " + a1);
		System.out.println("b1 value : " + b1);
		System.out.println("c1 value : " + c1);
		System.out.println("d1 value : " + d1);
	}

}