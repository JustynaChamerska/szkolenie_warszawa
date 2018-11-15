package polimor;

import java.io.File;
import java.util.Scanner;

public class Pliczki {
	
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in);){
			File file = new File (s.nextLine());
			File fileTarget = new File ("D:/Justyna/target.txt");
			
			copyFiles(file, fileTarget);
		} 
	}

	private static void copyFiles(File fileSource, File fileTerget) {
		
	}
}
