package com.testng.selenium;

import org.testng.annotations.DataProvider;

public class DemoDataProvider2 {

	@DataProvider(name = "create") 
	public static Object[][] createData() {
		return new Object[][] { { "sasi", "ssea", 111, 1234567890 }, 
			{ "Praveen", "ssea", 112, 1234567890 },
				{ "sasi1", "ssea1", 113, 1234567890 },
				{ "Praveen1", "ssea1", 114, 1234567890 },
				{ "sasi2", "ssea2", 115, 1234567890 },
				{ "Praveen2", "ssea2", 116, 1234567890 } };
	}

	
	@DataProvider(name = "fromXLS")
	public static Object[][] dataFromXLS() {
		return new Object[][] {  };
	}
	
	
	@DataProvider(name = "dbData")
	public static Object[][] createData2() {
		return new Object[][] { { "sasi", "ssea", 111 }, { "Praveen", "ssea", 112 }, { "sasi1", "ssea1", 113 },
				{ "Praveen1", "ssea1", 114 }, { "sasi2", "ssea2", 115 }, { "Praveen2", "ssea2", 116 } };
	}
}
//xls file nundi - method in java class by using return type of object[][]