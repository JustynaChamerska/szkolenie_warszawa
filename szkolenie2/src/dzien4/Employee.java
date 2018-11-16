package dzien4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import polimor.PracownikL;

public class Employee {

	private String name;
	//private String surname;
	private Integer salary;
	
	private static final Map<String, List<Employee>> STANOWISKO_TO_PRACOWNICY;
	
	static{
		
		STANOWISKO_TO_PRACOWNICY = new HashMap<>();
		List<Employee> pracownicy = new ArrayList<>();
		pracownicy.add(new Employee("Jan", 2_000));
		pracownicy.add(new Employee("Anna", 5_000));
		pracownicy.add(new Employee("Adam", 8_000));

		STANOWISKO_TO_PRACOWNICY.put("JavaProgrammer", pracownicy) ;
		
		List<Employee> pracownicy2 = new ArrayList<>();
		pracownicy2.add(new Employee("Zofia", 3_000));
		pracownicy2.add(new Employee("Karol", 7_000));

		STANOWISKO_TO_PRACOWNICY.put("Tester", pracownicy2) ;		
		
		
	}
	
	
	public Employee(String name, Integer salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		
		System.out.println("Iterowanie po kluczach i wartoœciach");
		
		for(Map.Entry<String, List<Employee>> entry : STANOWISKO_TO_PRACOWNICY.entrySet()) {
			String key = entry.getKey();
			if( "Tester".equals(key)) {
				List<Employee> valueList = entry.getValue();
				for(Employee e : valueList) {
					System.out.println("Lista pracowników do premiowania: " + e.getName() + ", wzarobki: "+ e.getSalary());
				}
				
			}
		}		
	}
}
