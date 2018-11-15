package polimor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PracownikL implements Comparable<PracownikL> {
	private String name;
	private String surname;
	private Integer age;
	private Float salary;

	public PracownikL(String name, String surname, int age, float salary) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		float suma = 0;
		Float sredniWiek = 0F;

		List<PracownikL> pracownicy = new ArrayList<>();
		pracownicy.add(new PracownikL("Jan", "Kowal", 30, 2_000));
		pracownicy.add(new PracownikL("Anna", "Kot", 45, 5_000));
		pracownicy.add(new PracownikL("Adam", "Mis", 65, 8_000));

		pracownicy.addAll(Arrays.asList(new PracownikL("Jan2", "Kowal2", 31, 2_002),
				new PracownikL("Jan3", "Kowal3", 33, 2_003)));

		Set<PracownikL> wynikowy = new TreeSet<>(pracownicy);
		System.out.println(wynikowy);


		/*
		 * for (PracownikL p : pracownicy) { suma += p.getSalary(); sredniWiek +=
		 * p.getAge(); }
		 * 
		 * sredniWiek /= pracownicy.size();
		 * 
		 * 
		 * System.out.println("Suma wynagrodzeñ: " + suma);
		 * System.out.println("Œredni wiek: " + sredniWiek.intValue());
		 */

		/*
		 * //Przyk³ad listy: float suma = 0; Float sredniWiek = 0F;
		 * 
		 * 
		 * List<PracownikL> pracownicy = new LinkedList<>(); pracownicy.add(new
		 * PracownikL("Jan", "Kowal", 30, 2_000)); pracownicy.add(new PracownikL("Anna",
		 * "Kot", 45, 5_000)); pracownicy.add(new PracownikL("Adam", "Mis", 65, 8_000));
		 * 
		 * pracownicy.addAll(Arrays.asList(new PracownikL("Jan2", "Kowal2", 31, 2_002),
		 * new PracownikL("Jan3", "Kowal3", 33, 2_003)));
		 * 
		 * for (PracownikL p : pracownicy) { suma += p.getSalary(); sredniWiek +=
		 * p.getAge(); }
		 * 
		 * sredniWiek /= pracownicy.size();
		 * 
		 * 
		 * System.out.println("Suma wynagrodzeñ: " + suma);
		 * System.out.println("Œredni wiek: " + sredniWiek.intValue());
		 */
	}

	@Override
	public int compareTo(PracownikL o) {//BLA
		// TODO Auto-generated method stub

		return Double.compare(o.salary, this.salary);

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append(salary);

		return builder.toString();
	}

}
