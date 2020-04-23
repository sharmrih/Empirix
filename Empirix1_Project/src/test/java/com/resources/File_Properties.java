package com.resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class File_Properties {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\resources\\OR.properties");
		Properties prop = new Properties();
		prop.load(file);        //Load the properties file
		
		//Print the value of xpath stored in OR.properties 
				System.out.println(prop.getProperty("Username_Xpath"));
				

	}

}
