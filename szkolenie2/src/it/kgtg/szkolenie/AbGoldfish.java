package it.kgtg.szkolenie;

public class AbGoldfish extends AbFish {

	public AbGoldfish(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String get_Info() {
		// TODO Auto-generated method stub
		//System.out.println("Tu ryba: Name: " + nazwaGatunku + ", Age: " + age);
		return "Tu Goldfish: Name: " + nazwaGatunku + ", Age: " + age;
		
	}

}
