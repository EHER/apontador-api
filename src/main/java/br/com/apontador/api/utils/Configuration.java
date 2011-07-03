package br.com.apontador.api.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {

	private static Properties properties;
	
	static {
		try {
			ClassLoader loader = PropertyLoader.class.getClassLoader();
			InputStream in = loader.getResourceAsStream("config.properties");
			properties = new Properties();
			properties.load(in);
		} catch (IOException e) {
			throw new RuntimeException("Error reading config.properties", e);
		}
	}
	
	public static String getHost() {
		return properties.getProperty("HOST");
	}

	public static String getPath() {
		return properties.getProperty("PATH");
	}

	public static String getKey() {
		return properties.getProperty("KEY");
	}

	public static String getSecret() {
		return properties.getProperty("SECRET");
	}
}