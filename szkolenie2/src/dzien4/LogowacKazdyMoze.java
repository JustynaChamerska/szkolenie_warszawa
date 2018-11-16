package dzien4;

import java.util.logging.Logger;
import java.util.logging.Level;

//przyklad logowania wg standardowej klasy Logger troche toporny
public class LogowacKazdyMoze {

	
	protected final Logger log = Logger.getLogger(getClass().getName());
	
	
	public void metoda(){
		log.log(Level.INFO, "Moja wiadomoœæ");
	}
	
	public static void main(String[] args) {
		LogowacKazdyMoze m = new LogowacKazdyMoze();
		m.metoda();
	}
	
}
