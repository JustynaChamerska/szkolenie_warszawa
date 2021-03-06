package polimor;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Serializacja {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		String filePath = "D:/objects.bin";
		Path path =Paths.get(filePath);
		
		if(Files.notExists(path)) {
			Files.createFile(path);
		}
		
		//Zapis do pliku
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))){
			out.writeObject(Integer.valueOf(10));
			out.writeObject(Integer.valueOf(20));
			
		}

		//Odczyt z pliku		
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))){
			Integer number1 = (Integer) in.readObject();
			System.out.println("Pierwsza: " + number1);
			
			Integer number2 = (Integer) in.readObject();
			System.out.println("Druga: " + number2);			
		}
	}		
}
