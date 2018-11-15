package finals;

public class Books {
      String tittle ;
      int ileStron;
      public static int ileBooks;
      
	private Books(String tittle, int ileStron) {
		super();
		this.tittle = tittle;
		this.ileStron = ileStron;
		ileBooks ++;
		
	}
      
	
	public static void main(String[] args) {
		Books b1 = new Books("Krzyzacy", 200);
		Books b2 = new Books("Potop", 600);
		System.out.println(Books.ileBooks);
		
		System.out.println(MyStringUtils.changeCase(b1.tittle));
		
		
		
	}
      
}
