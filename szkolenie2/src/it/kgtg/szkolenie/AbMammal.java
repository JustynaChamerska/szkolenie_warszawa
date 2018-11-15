package it.kgtg.szkolenie;

public abstract class AbMammal extends AbAnimal {

	
	public AbMammal(String name, int age) {
		super(name, age);
		this.nazwaGatunku =name;
		// TODO Auto-generated constructor stub
	}

	public String nazwaGatunku; 
	
	@Override
	public String get_Info() {
		// TODO Auto-generated method stub
		return "Tu ssak: Name: " + nazwaGatunku + ", Age: " + age;
	}

}
