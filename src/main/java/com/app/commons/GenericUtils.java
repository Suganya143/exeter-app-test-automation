package com.app.commons;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class GenericUtils {

	public static Properties AppFileReader() {
		FileReader reader = null;
		try {
			reader = new FileReader("src/main/resources/data/App.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Properties property = new Properties();
		try {
			property.load(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return property;
	}

}
