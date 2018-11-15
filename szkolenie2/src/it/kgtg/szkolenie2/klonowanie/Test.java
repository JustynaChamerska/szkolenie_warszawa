package it.kgtg.szkolenie2.klonowanie;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException{
		Punkt p1 = new Punkt(10, 10);
		Punkt p2 = (Punkt) p1.clone();
		Punkt p3 = new Punkt(10, 10);
		
		Odcinek o1 = new Odcinek(new Punkt(10, 10), new Punkt(20, 20));
		Odcinek o2 = (Odcinek) o1.clone(); 
		Odcinek o3 = new Odcinek(new Punkt(10, 10), new Punkt(20, 20)); 

		
		boolean porownanie1 = o1 == o2;
		boolean porownanie2 = o1 == o3;			
		
		/*boolean porownanie1 = p1 == p2;
		boolean porownanie2 = p1 == p3;*/
	
		
		System.out.println("Porownanie 1: " + porownanie1);
		System.out.println("Porownanie 2: " + porownanie2);
		
		wyswietlO (o1, o2, o3);
		o2.setStart( new Punkt(21, 22));
		o3.setStart( new Punkt(31, 32));
		//o3.setStart(12);		
		
		wyswietlO (o1, o2, o3);
		/*wyswietl (p1, p2, p3);
		
		p2.setX(11);
		p3.setX(12);
		wyswietl (p1, p2, p3);*/
	}

	private static void wyswietlO(Odcinek... odcinki) {
		
		for(int i = 0; i < odcinki.length; i++) {
			//System.out.println("Odcinek.Start " + i + " x: " + odcinki[i].getStart().wyswietl() );//+ ", y: " + points[i].getY()
		System.out.println("Odcinek.Start " + i + " x: " ); wyswietl(odcinki[i].getStart()) ;//+ ", y: " + points[i].getY()
		// TODO Auto-generated method stub
		}
		
	}
	
	private static void wyswietl(Punkt... points) {
		
		for(int i = 0; i < points.length; i++)
			System.out.println("Punkt " + i + " x: " + points[i].getX() + ", y: " + points[i].getY());
		// TODO Auto-generated method stub
		
	}

	
	
}
