package it.kgtg.szkolenie;

import java.util.Date;

public class ListaPlac {

	public static void main(String[] args) {
		
	
	
	Pracownik prZwykly = new PracownikZwykly("Jan", "Jakis", new Date());
	prZwykly.setPensja(1000);
	
	PracownikSzef prSzef = new PracownikSzef("Adam", "Szef", new Date());
	prSzef.setPensjaFactor(1000, 2);
	
	System.out.println("Imie:" + prZwykly.getImie() + ", pensja: " + prZwykly.getPensja());
	System.out.println("Imie:" + prSzef.getImie() + ", pensja: " + prSzef.getPensja());
	System.out.println(prSzef.toString());
	System.out.println(prSzef.hashCode());
	
	
	}
}
