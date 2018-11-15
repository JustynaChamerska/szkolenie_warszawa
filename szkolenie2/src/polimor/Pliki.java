package polimor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Pliki {
/*//U¿ycie File:
	public static void main(String[] args) {
		String nazwa;
		
		try (Scanner s = new Scanner(System.in);){
			nazwa = s.nextLine();
		} //to jest instrukcja "try with resource": po wyjœciu z tego bloku zamknie scanera	

					

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
	*/

	/*
	//U¿ycie File przez trenera:
	public static void main(String[] args) {
		
		try (Scanner s = new Scanner(System.in);){
			File file = new File (s.nextLine());
			listFiles(file);
		} //to jest instrukcja "try with resource": po wyjœciu z tego bloku zamknie scanera		
	}

	public static void listFiles(File file) {
		
		if (file == null) {
			return ;

		} 
		if (file.isFile()) {
			
			System.out.println(file.getName());

		}else {
			for(File child : file.listFiles()) {
				listFiles(child);
			}
		}
			
	}
*/
	//pisanie do pliku
	public static void main(String[] args) {

		
//	    przykladZapisu2();	
//		przykladZapisu();		
		
	}

private static void przykladZapisu() {
	File f =new File("D:/PLICZEK");
	
	try (FileWriter out =new FileWriter(f)){
		f.createNewFile();
		out.write("Hallo".toCharArray());// konwersja na tablicê znaków; to nie powoduje apisu do pliku - dopiero flush lub zamkniecie pliku 
	}catch(IOException e) {
		e.printStackTrace();
	}
}

	private static void przykladZapisu2() {
		File f =new File("D:/PLICZEK");
		FileWriter out = null;
		
		try {
			f.createNewFile();
			out = new FileWriter(f);
			out.write("Hallo".toCharArray());// konwersja na tablicê znaków; to nie powoduje apisu do pliku - dopiero flush lub zamkniecie pliku 
		}catch(IOException e) {
			e.printStackTrace();
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
