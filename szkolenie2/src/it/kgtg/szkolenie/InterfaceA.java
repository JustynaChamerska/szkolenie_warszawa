package it.kgtg.szkolenie;

public interface InterfaceA {
	int MOJA_STALA = 200_000;
	
	default void sayHello(String imie) {
	System.out.println("Hello " + imie);
	};


static void say() {
	System.out.println("Czesc2 " );
}
}
