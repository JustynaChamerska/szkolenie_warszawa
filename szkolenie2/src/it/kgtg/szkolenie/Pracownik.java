package it.kgtg.szkolenie;

import java.util.Date;

public class Pracownik {

	String imie;
	String nazwisko;
	Date dataUrodz;
	float pensja;
	
	public Pracownik(String imie, String nazwisko, Date dataUrodz) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.dataUrodz = dataUrodz;
	
	}
	
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public Date getDataUrodz() {
		return dataUrodz;
	}
	public void setDataUrodz(Date dataUrodz) {
		this.dataUrodz = dataUrodz;
	}
	public float getPensja() {
		return pensja;
	}
	public void setPensja(float pensja) {
		this.pensja = pensja;
	}
	
	
}
