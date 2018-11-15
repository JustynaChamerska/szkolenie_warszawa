package it.kgtg.szkolenie;

public abstract class AbFish extends AbAnimal {

	public String nazwaGatunku; 

	
	
	public AbFish(String name, int age) {
		super(name, age);
		this.nazwaGatunku = name;
		//this.age = age;
		//
		// TODO Auto-generated constructor stub
	}

	@Override
	public String get_Info() {
		// TODO Auto-generated method stub
		//System.out.println("Tu ryba: Name: " + nazwaGatunku + ", Age: " + age);
		return "Tu ryba: Name: " + nazwaGatunku + ", Age: " + age;
		
	}

}
