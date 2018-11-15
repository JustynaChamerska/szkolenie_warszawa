package it.kgtg.szkolenie;

public class MyClassI implements InterfaceA {
	@Override
	public void sayHello(String imie) {
		//System.out.println("Hello " + imie);
		InterfaceA.super.sayHello(imie);
	}
	public static void main(String[] args) {
		System.out.println(InterfaceA.MOJA_STALA);
		
		InterfaceA.say();
	}
}
