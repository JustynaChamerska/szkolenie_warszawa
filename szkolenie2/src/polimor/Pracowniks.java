package polimor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Pracowniks implements Serializable {
	
	public Pracowniks(String nazwiskoRodowe, String nazwisko) {
		super();
		this.nazwiskoRodowe = nazwiskoRodowe;
		this.nazwisko = nazwisko;
	}

	private transient String nazwiskoRodowe;
	private String nazwisko;
	
	private static final long serialVersionUID = 1L;
	
	
	public static void main(String[] args) {
		String filePath = "D:/My.txt";
		Path path =Paths.get(filePath);
		
		try {
			

		if(Files.notExists(path)) {
			Files.createFile(path);
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("1");
		
		//Zapis do pliku
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))){
			//out.writeObject(Integer.valueOf(10));
			//out.writeObject(Integer.valueOf(20));
		/*	Apple apple = new Apple("Rubin", 20, "czerwony");			
			out.writeObject(apple);
			Apple apple2 = new Apple("Jonagold", 30, "¿ó³ty");			
			out.writeObject(apple2);*/
			Pracowniks pr1 = new Pracowniks("rodowe", "nazwisko");
			out.writeObject(pr1);
			System.out.println("2");
		}catch(Exception e) {
			e.printStackTrace();
		}System.out.println("3");
		
		//Odczyt z pliku		
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))){
			/*Apple apple1 = (Apple) in.readObject();
			System.out.println("Pierwsza: " + apple1.getName() + ", " + apple1.getColour());
			
			Apple apple2 = (Apple) in.readObject();
			System.out.println("Pierwsza: " + apple2.getName() + ", " + apple2.getColour());	*/	
			Pracowniks pr1 = (Pracowniks) in.readObject();
			System.out.println("Odczytany: " + pr1.nazwisko + ", " + pr1.nazwiskoRodowe);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException{
		stream.defaultReadObject();
		stream.readInt();
		//nazwiskoRodowe = "jakieœ";//stream.readInt();
	}
	
	private void writeObject(ObjectOutputStream stream) throws IOException{
		stream.defaultWriteObject();
//		stream.writ(nazwiskoRodowe + "a");
	}

}
