package dzien4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//ta klasa testowana samodzielnie
public class Inne {

	public static void main(String[] args) {
		przyklad1();
		
		przyklad2();
	}

	private static void przyklad2() {
		List<Integer> liczby = new ArrayList<>();
		
		liczby.add(9);
		liczby.add(-1);
		liczby.add(12);
		
		Collections.shuffle(liczby);//zwraca warto�ci losowo
		
		for(Integer integer : liczby) {
			System.out.println(integer);
		}
	}	
	
	private static void przyklad1() {
		String[] array = {"a", "d", "w"};
		Arrays.sort(array); //sortowanie
		
		List<String> lista = Arrays.asList(array);//konwersja Arrays na List , bo List tylko ma t� metod� i wiele innych
		
		Collections.reverse(lista);//odwr�cenie element�w na li�cie
		
		String[] wynikowa = lista.toArray(new String[0]);  //liczba 0 jest po to �eby to by�o bezpieczne wielow�tkowo
		
		for(String string : wynikowa) {
			System.out.println(string);
		}
	}
}
