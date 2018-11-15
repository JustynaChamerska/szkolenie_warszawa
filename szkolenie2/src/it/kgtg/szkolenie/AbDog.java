package it.kgtg.szkolenie;

public class AbDog extends AbMammal {
	public AbDog(String name, int age, int ileLap, int ileZebow) {
		super(name, age);
		this.ileLap = ileLap;
		this.ileZebow = ileZebow;
	}

	private final int ileLap;
	private int ileZebow;
	
	public final void dajGlos() {
		System.out.println("Hau-Hau");
	}

	public int getIleZebow() {
		return ileZebow;
	}

	public void setIleZebow(int ileZebow) {
		this.ileZebow = ileZebow;
	}

	public int getIleLap() {
		return ileLap;
	}
	
}
