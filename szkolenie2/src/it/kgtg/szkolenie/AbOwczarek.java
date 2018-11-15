package it.kgtg.szkolenie;

public class AbOwczarek extends AbDog {
/*	
	public AbOwczarek(String name, int age, int ileLap, int ileZebow, String imie) {
		super(name, age, ileLap, ileZebow);
		this.imie = imie;
	}*/

	String imie;
	private final int ilePazurow, ileBraci; 
	
	public AbOwczarek(String name, int age, int ileLap, int ileZebow, String imie, int ilePazurow, int ileBraci) {
		super(name, age, ileLap, ileZebow);
		this.imie = imie;
		//this.ilePazurow = ilePazurow;
		this.ileBraci = ileBraci;
		System.out.println("Jestem w konstruktorze ");
	}

	
	{
		System.out.println("Jestem w bloku ");
		ilePazurow = 20;
	}
	
	
	public static void main(String[] args) {
		AbOwczarek mojAzorek = new AbOwczarek("Owczarek niemiecki", 2, 4, 20, "Azorek", 24, 3);
		mojAzorek.dajGlos();
		mojAzorek.setIleZebow(24);
		System.out.println("IleZebow: " + mojAzorek.getIleZebow());
		
	//	mojAzorek.ileBraci=8;
	}

	/*
	@Override
	public void dajGlos() {
		System.out.println("Hau-Hau");
	}*/

	@Override
	public int getIleZebow() {
		// TODO Auto-generated method stub
		return super.getIleZebow();
	}

	@Override
	public int getIleLap() {
		// TODO Auto-generated method stub
		return super.getIleLap();
	}

	
}
