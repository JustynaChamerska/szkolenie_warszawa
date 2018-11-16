package dzien4;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyLoader {

	private static final String PROPERTIES_FILE = "config.properties";
	private static final Properties PROPERTIES = loadProperties();

	private static Properties loadProperties() {
		Properties properties = new Properties();

		try (InputStream input = PropertyLoader.class.getClassLoader().getResourceAsStream(PROPERTIES_FILE)) {
			properties.load(input);

		} catch (IOException e) {
			e.printStackTrace();
		}

		return properties;
	}

	public static String getProperty(String key) {
		return PROPERTIES.getProperty(key);
	}

	public static void main(String[] args) {
		System.out.println(getProperty("wiadomosc"));
	}

}
