package com.vwo.app.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Properties;

public class PropertyReader extends Hashtable {

	public PropertyReader(){

	}

	public static Properties readPropertiesFile(String fileName) throws IOException {
		FileInputStream fis = null;
		Properties prop = null;
		try {
			fis = new FileInputStream("C:/Users/asus/Desktop/javaApp/VWO_App_UI_Automation/src/main/resources/data.properties");
			prop = new Properties();
			prop.load(fis);
		}
		catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		finally {
			fis.close();
		}
		return prop;
	}
}

