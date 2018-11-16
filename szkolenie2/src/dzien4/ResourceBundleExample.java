package dzien4;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleExample {

	public static void main(String[] args) {
		Locale locale = new Locale("pl", "PL");

		ResourceBundle message = ResourceBundle.getBundle("i18n.message", locale);// "i18n.message" - scie¿ka do pliku

		System.out.println(message.getString("panel.klienta.wiadomosc"));
	}

}
