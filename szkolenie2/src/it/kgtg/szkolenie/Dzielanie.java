package it.kgtg.szkolenie;

import java.util.Scanner;

public class Dzielanie {

	
	public static void main(String[] args) {	
		Scanner s = new Scanner(System.in);
		String operationtype =s.nextLine();
		
		int first=2;
		int second = 4;
		
		Operation operationToPerform = new Mnozenie();
		
		if("D".equalsIgnoreCase(operationtype)) {
			operationToPerform = new Dodawanie();
		}
		
		int wynik = operationToPerform.perform(2, 4);
		System.out.println("Wynik:" + wynik);
		
	/*	boolean d_dodawanie =true;
		boolean d_mnozenie =false;
		int first=2;
		int second = 4;
		int wynik; 
		
		Dodawanie myDodawanie = new Dodawanie();
		Mnozenie myMnozenie = new Mnozenie();	
		//Operation operation = new Dodawanie();
		
		if (d_dodawanie) {
		//wynik = operation.perform(first, second);	
			wynik = myDodawanie.perform(first, second)	;	
		}
		else if (d_mnozenie) {
			//operation = new Mnozenie();
			wynik = myMnozenie.perform(first, second)	;
		}
		//wynik = operation.perform(first, second)	;
		return wynik;*/
	}
	

	

}
