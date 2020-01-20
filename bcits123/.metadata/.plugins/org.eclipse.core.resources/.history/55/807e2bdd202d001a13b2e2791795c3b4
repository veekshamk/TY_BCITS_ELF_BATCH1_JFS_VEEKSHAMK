package com.bcits.myproperties.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {
	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream=new FileInputStream("dbinfo.properties");
			Properties properties=new Properties();

			properties.load(fileInputStream);
			System.out.println("driver name=>"+ properties.getProperty("driverNM"));
			System.out.println("DBURL=>"+ properties.getProperty("dbURL"));
			System.out.println("User Name=>"+ properties.getProperty("user"));
			System.out.println("Password=>"+properties.getProperty("password"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
