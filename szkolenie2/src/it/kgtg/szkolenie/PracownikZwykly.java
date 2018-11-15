package it.kgtg.szkolenie;

import java.util.Date;

public class PracownikZwykly extends Pracownik {

	public PracownikZwykly(String imie, String nazwisko, Date dataUrodz) {
		super(imie, nazwisko, dataUrodz);
		// TODO Auto-generated constructor stub
		
	}
	
	@Override
	public void setPensja(float pensja) {
		this.pensja = pensja;
	}
	
}
