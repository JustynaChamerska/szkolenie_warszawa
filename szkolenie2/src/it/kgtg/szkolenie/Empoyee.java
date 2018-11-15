package it.kgtg.szkolenie;

import java.util.Arrays;
import java.util.Comparator;

public class Empoyee implements Comparable<Empoyee>
{

	public Empoyee(String name, double salary ) {
		super();
		this.name = name;
		this.salary = salary;
		
	}

	double salary ;
	String name;
	
	
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public double getSalary() {
		return salary;
	}


	@Override
	public int compareTo(Empoyee o) {
		return Double.compare(this.getSalary(), o.getSalary());
	}
	
	public static void main(String[] args) {
		Empoyee[] array = {new Empoyee("Jan", 4_000), new Empoyee("Kasia", 3_000) };
		Arrays.sort(array);
		System.out.println(array);
		System.out.println(array[0].name);
		System.out.println(array[0].getSalary());
		System.out.println(array[1].name);
		System.out.println(array[1].getSalary());
		
		
	}
	
	class SortByName implements Comparator<Empoyee>{
		public int compare(Empoyee o1, Empoyee o2) {
			return o1.name.compareTo(o2.name);
		}
	}
	
}
