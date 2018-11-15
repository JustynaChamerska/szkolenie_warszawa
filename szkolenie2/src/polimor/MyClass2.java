package polimor;

import java.util.Comparator;

public class MyClass2 implements Comparator<PracownikL2>{

	@Override
	public int compare(PracownikL2 o1, PracownikL2 o2) {
		return Double.compare(o1.getSalary(), o2.getSalary());
	}
	

}
