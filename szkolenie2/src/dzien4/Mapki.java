package dzien4;

import java.util.HashMap;
import java.util.Map;

public class Mapki {

	//to dodane p�niej
	private static final Map<Integer, Employee> PESEL_TO_EMPLOYEE;
	
	static {
		PESEL_TO_EMPLOYEE = new HashMap<>(2);
		PESEL_TO_EMPLOYEE.put(678901, new Employee("Kamil", 678901));
		PESEL_TO_EMPLOYEE.put(678902, new Employee("Anna", 678902));
	}
	//dot�d dodane p�niej
	
	
	public static void main(String[] args) {
		

		
		Map<String, String> pairs = new HashMap<>();//Map<String, String> pairs = new HashMap<>(2); - mozna tak poda� inicjalny rozmiar HashMapy
		pairs.put("Marcin", "Adela"); 
		pairs.put("Marek", "Magda");
		
		Map<String, String> pairs2 = new HashMap<>();
		pairs2.put("Kamil", "Ewa");
		pairs2.put("Marek", "Ewa");		
		
		pairs.putAll(pairs2);
		
		System.out.println("Iterowanie po warto�ciach");
		
		for(String value : pairs.values()) {
			System.out.println(value);
		}
		
		System.out.println("Iterowanie po kluczach i pobieranie warto�ci");
		
		for(String key : pairs.keySet()) {
			String value = pairs.get(key);
			System.out.println(value);
		}		
		
		System.out.println("Iterowanie po kluczach i warto�ciach");
		
		for(Map.Entry<String, String> entry : pairs.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Klucz: " + key + ", wartosc: "+ value);
		}			
		
		String nieistniejacyelement = pairs.get("Czego� tam nie ma");
	}
	
}
