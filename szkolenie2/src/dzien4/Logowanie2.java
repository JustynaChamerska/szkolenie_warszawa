package dzien4;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * To jest moja klasa która testuje logowanie
 * 
 * @author student
 * @since 2018-11-16
 * @version 5
 * @see LogowacKazdyMoze#metoda()
 *
 */

public class Logowanie2 {
	//przyk³ad produkcyjny logowania log4j - mozna konfigurowaæ prze plik XML, propertisy, w jakiœ sposób przechodziæ do linijki javy
	
	
	private static final Logger LOG = LogManager.getLogger(Logowanie2.class);
	
	public static void main(String[] args) {
		LOG.debug("Wynik operacji to: {}, prawda ¿e jest to {}",  1+2,  "ciekawe");
		
		
		//przyk³ad w³aœciwej obs³ugi logowania: - z³apany wyjatek do pliku logu
		try {
			String value =getName();
		}catch(IOException e) {
			LOG.error(e.getMessage(), e);
		}
		
		
		
		
		
	}
	
	private static String getName() throws IOException{
		throw new IOException("Masz pecha"); //rzuca wyjatek w celu obserwacji jak jest logowany
		//return "Kasia";
	}
	
	
}
