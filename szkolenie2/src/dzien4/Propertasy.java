package dzien4;

import java.util.Properties;

public class Propertasy {
	
	public static void main(String[] args) {
		
		Properties properties = new Properties();
		properties.put("blog", "blog.jsystems.pl");
		properties.put("ankiety", "ankiety.jsystems.pl");
		
		for(Object url : properties.keySet()) {
			String urlAsString = (String) url;
			System.out.println("Url dla " + urlAsString + " to " + properties.getProperty(urlAsString));
			
		}
		System.out.println("Nie istniejaca w³asciwoœæ: " + properties.getProperty("...", "Domyslna"));
	}
}
