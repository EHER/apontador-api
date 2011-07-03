package br.com.apontador.api.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyLoader {
	
	public static Properties loadProperties(String name) {
		ClassLoader loader = PropertyLoader.class.getClassLoader();
		InputStream in = loader.getResourceAsStream(name);
		Properties result = new Properties();
		
		try {
			result.load(in);
		} catch (IOException e) {
			result = null;
		}
		
		return result;
	}
}