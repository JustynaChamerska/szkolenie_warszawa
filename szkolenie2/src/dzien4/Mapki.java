package dzien4;

import java.util.HashMap;
import java.util.Map;

public class Mapki {

	//to dodane pó¿niej
	private static final Map<Integer, Employee> PESEL_TO_EMPLOYEE;
	
	static {
		PESEL_TO_EMPLOYEE = new HashMap<>(2);
		PESEL_TO_EMPLOYEE.put(678901, new Employee("Kamil", 678901));
		PESEL_TO_EMPLOYEE.put(678902, new Employee("Anna", 678902));
	}
	//dot¹d dodane pó¿niej
	
	
	public static void main(String[] args) {
		

		
		Map<String, String> pairs = new HashMap<>();//Map<String, String> pairs = new HashMap<>(2); - mozna tak podaæ inicjalny rozmiar HashMapy
		pairs.put("Marcin", "Adela"); 
		pairs.put("Marek", "Magda");
		
		Map<String, String> pairs2 = new HashMap<>();
		pairs2.put("Kamil", "Ewa");
		pairs2.put("Marek", "Ewa");		
		
		pairs.putAll(pairs2);
		
		System.out.println("Iterowanie po wartoœciach");
		
		for(String value : pairs.values()) {
			System.out.println(value);
		}
		
		System.out.println("Iterowanie po kluczach i pobieranie wartoœci");
		
		for(String key : pairs.keySet()) {
			String value = pairs.get(key);
			System.out.println(value);
		}		
		
		System.out.println("Iterowanie po kluczach i wartoœciach");
		
		for(Map.Entry<String, String> entry : pairs.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Klucz: " + key + ", wartosc: "+ value);
		}			
		
		String nieistniejacyelement = pairs.get("Czegoœ tam nie ma");
	}
	
}
