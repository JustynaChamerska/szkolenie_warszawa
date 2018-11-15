package polimor;

import java.util.Date;

public class Pracownik {
	private String imie;
	private String nazwisko;
	private Date dataZatrudnienia;
	
	
	public static class PracownikBuilder{
		private Pracownik pracownik = new Pracownik();
		
		public PracownikBuilder withImie(String imie) {
			pracownik.imie = imie;
			return this;
		}
		

		public PracownikBuilder withNazwisko(String nazwisko) {
			pracownik.nazwisko = nazwisko;
			return this;
		}
		
		public PracownikBuilder withDataZatrudnienia(Date dataZatrudnienia) {
			pracownik.dataZatrudnienia = dataZatrudnienia;
			return this;
		}
		
		public Pracownik build() {
			return pracownik;
		}
		
	}
	
	
	public static boolean isPalindrome(String word) {
		
		StringBuilder builder = new StringBuilder();
		builder.append(word);
		
		if (builder.length()==0) {
			return false;
			
		}else if(builder.reverse().toString().equals(word)) {
			return true;
		}else {
		return false;
		}
	}
	
	
	public static int headSum(int n) {
		if(n >= 1 ) {
			return headSum(n-1)+n;
		}
		return n;
	}
	
	public static int tailSum(int currentSum, int n) {
		if(n <=1 ) {
			return currentSum+n;
		}
		return tailSum(currentSum +n, n-1);
	}	
	
	public static int ciag(int currentVal, int n) {
		if (n == 0) {
			return currentVal;
		}
		else if (n == 1) {
			return currentVal+n;
		} 
		
		return ciag(currentVal +2*n -3, n-1);
	}
	
	File
	public static void main(String[] args) {
		
		System.out.println(ciag(0, 3));
		
		/*String slowo="ala";
		
		
		System.out.println(isPalindrome(slowo));*/
		/*Pracownik[] pracownicy = {new Pracownik("Jan", "Kowal", new Date), new Pracownik("Anna", "Bak", new Date)};
		
		StringBuilder builder = new StringBuilder();
		
		for (Pracownik pracownik: pracownicy) {
			builder.append(pracownik.imie).append(", ");
		}
		
		String wynik = builder.toString();
		System.out.println(wynik);*/
		
		
		
		
		
	/*	Pracownik p = new Pracownik.PracownikBuilder()
				.withImie("Jan")
				.withNazwisko("Kowalski")
				.withDataZatrudnienia(new Date())
				.build();
		
		System.out.println(p);*/
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pracownik [imie=");
		builder.append(imie);
		builder.append(", nazwisko=");
		builder.append(nazwisko);
		builder.append(", dataZatrudnienia=");
		builder.append(dataZatrudnienia);
		builder.append("]");
		return builder.toString();
		
		
	}
	
	
}
