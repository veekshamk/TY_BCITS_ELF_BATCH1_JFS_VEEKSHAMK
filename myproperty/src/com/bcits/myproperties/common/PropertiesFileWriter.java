package com.bcits.myproperties.common;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileWriter {
	public static void main(String[] args) {
		try {
		FileOutputStream fileOutputStream=new FileOutputStream("db1info.properties");
		Properties properties=new Properties();
		properties.setProperty("driverNM","com.mysql.jdbc.Driver" );
		properties.setProperty("dbURL", "jdbc:mysql://localhost:3306/employee_management_info");
		properties.setProperty("user", "root");
		properties.setProperty("password", "root");
		
		try {
			properties.store(fileOutputStream, "Db detail");
			System.out.println("file created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
