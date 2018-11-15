package polimor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;

public class TestP {
	
public static void main(String[] args) {
	
}
/*	public static void main(String[] args) {

		Product[] koszyk = new Product[3];

		koszyk[0] = new Apple("Eliza", 10, "czerwone");
		koszyk[1] = new Tomatoe("Malinowy", 10, "zielony");
		koszyk[2] = new Tomatoe("Wino", 10, "zloty");
		int suma = 0;

		boolean bZakazane = false;
		StringBuilder builder = new StringBuilder();
		builder.append("TestP [koszyk=");
		
		for (Product p : koszyk) {
		//	bZakazane = false;
		//	for(String s : Product.ZAKAZANE) {
		//		if p.getName().equals(s.ZAKAZANE){
		//			bZakazane = true;
		//		}
		//		
		//		
		//	}
			if (!bZakazane){
				suma += p.getPrice();
			}
			
			builder.append("[" + p.getName() + " " + p.getPrice());
			
			
			if (p instanceof Apple) {			
				Apple a = (Apple) p;				
				builder.append(" " + a.getColour());
			} else if(p instanceof Tomatoe) {
				Tomatoe t = (Tomatoe) p;
				builder.append(" " + t.getSize() );
			}
			builder.append(" ]" );
			przykladZapisu2("D:/Justyna/" + p.getName() + ".txt", builder.toString());
					
			System.out.println(builder.toString());
			builder.delete(1, builder.length());
		}
		
		System.out.println("Cena ca³ego koszyka: " + suma);
		

//		builder.append(", suma=");
//		builder.append(suma);
//		builder.append(", p=");
//		builder.append(p);
		builder.append("]");
		System.out.println(builder.toString());
		
		
	}*/
/*	
	private static void przykladZapisu2(String sciezka, String dane) {
		File f =new File(sciezka);
		FileWriter out = null;
		
		try {
			f.createNewFile();
			out = new FileWriter(f);
			out.write(dane.toCharArray());// konwersja na tablicê znaków; to nie powoduje apisu do pliku - dopiero flush lub zamkniecie pliku 
			out.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}	*/	
	
	private static void przykladOczytu() {
		File f =new File("D:/PLICZEK/Eliza");
		
		
		try (BufferedReader reader = new BufferedReader(new FileReader(f))){
			String line;
			
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}	
	
	private static void przykladKopia() {
		//Files.copy("D:/PLICZEK/Eliza", "D:/Eliza2", StandardCopyOption.REPLACE_EXISTING);
		
		
		
		/*
		try (BufferedReader reader = new BufferedReader(new FileReader(f))){
			String line;
			
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}*/
	}		
	
	
	
/*
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TestP [koszyk=");
		builder.append(koszyk[0].getName);
		
		
		
		builder.append(Arrays.toString(koszyk));
		builder.append(", suma=");
		builder.append(suma);
		builder.append(", p=");
		builder.append(p);
		builder.append("]");
		return builder.toString();
	}*/

}
