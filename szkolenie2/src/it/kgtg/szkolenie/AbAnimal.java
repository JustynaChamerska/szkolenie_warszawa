package it.kgtg.szkolenie;

public abstract class AbAnimal {
	private String name;
	public int age;

	public AbAnimal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public abstract String get_Info() ;
}
