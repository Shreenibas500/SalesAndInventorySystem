package com.SSinventory.fileUtility;

import java.io.FileInputStream;
import java.util.Properties;


public class JavaFileUtility {
	public String getDataFromPropertiesFile(String key) throws Throwable  {
		
		FileInputStream fis = new  FileInputStream(".\\configAppData\\commondata.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String data = pobj.getProperty(key);
		
		return data;
		
	}
	

	
	

}
