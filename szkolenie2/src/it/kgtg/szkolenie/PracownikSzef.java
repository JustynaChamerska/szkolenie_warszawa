package it.kgtg.szkolenie;

import java.util.Date;

public class PracownikSzef extends Pracownik {
	
	public PracownikSzef(String imie, String nazwisko, Date dataUrodz) {
		super(imie, nazwisko, dataUrodz);
		// TODO Auto-generated constructor stub
	}

	float factor ;// 1.2;
	
	@Override
	public void setPensja(float pensja) {
		this.pensja = pensja * factor;
	}

	public void setPensjaFactor(float pensja, float factor) {
		this.pensja = pensja;
		this.factor = factor;
	}
	
}
