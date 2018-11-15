package it.kgtg.szkolenie;

public class MyClass implements MyInterface{

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
	System.out.println("Implementacja interfejsu");	
	}
	
public static void main(String[] args) {
	MyClass my = new MyClass();
	my.doSomething();
}
	

}
