package polimor;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PracownikL2  {
	private String name;
	private String surname;
	private Integer age;
	private Float salary;

	public PracownikL2(String name, String surname, int age, float salary) {
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

		List<PracownikL2> pracownicy = new ArrayList<>();



		Set<PracownikL2> wynikowy = new TreeSet<>(new MyClass2());
		wynikowy.add(new PracownikL2("Jan", "Kowal", 30, 2_000));
		wynikowy.add(new PracownikL2("Anna", "Kot", 45, 5_000));
		wynikowy.add(new PracownikL2("Adam", "Mis", 65, 8_000));		
		System.out.println(wynikowy);


		
	}
/*
	@Override
	public int compareTo(PracownikL2 o) {//BLA
		// TODO Auto-generated method stub

		return Double.compare(o.salary, this.salary);

	}*/

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append(salary);

		return builder.toString();
	}

}
