package polimor;

import java.io.File;
import java.util.Scanner;

public class Pliki {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String nazwa = s.nextLine();

		File plik2 = new File(nazwa);
		if (plik2.exists() & plik2.isDirectory()) {
			File plik3 = new File(nazwa + "\\fol3\\fol3_1\\fol3_1_1\\test.txt");
			if (!plik3.exists()) {
				// plik3.mkdirs();
				try {
					boolean res = plik3.createNewFile();
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}

		Pliki.wypiszKat(nazwa);
	}

	public static void wypiszKat(String nazwa) {
		File plik = new File(nazwa);
		if (plik.exists()) {
			if (plik.isDirectory()) {
				String[] pliki = plik.list();

				if (pliki.length != 0) {

					for (String z : pliki) {
						System.out.println(z);
						Pliki.wypiszKat(nazwa + "\\" + z);

					}
				}
			}

		} else {
			System.out.println("Nie istnieje plik: " + nazwa);

		}
	}

	private static void przyklad1() {
		File plik = new File("C:/test.txt");
		System.out.println("Czy to jest plik?:" + plik.isFile());
		System.out.println("Nazwa: " + plik.getName());

		File nowyKatalog = new File("C:/d3");
		boolean utworzono = nowyKatalog.mkdir();

		System.out.println("Utworzono katalog?:" + utworzono);

		nowyKatalog.deleteOnExit();

	}
}
