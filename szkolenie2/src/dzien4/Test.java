package dzien4;

public class Test {

	public static void main(String[] args) {
		Koszulka k = new Koszulka("Adidas", TshirtSize.XL);
		
		//mozna por�wnywa� w ten spos�b:
		if(k.getRozmiar() == TshirtSize.XL) {
			//co� tam...
		}
		//prztk�ad z switch:
		
		switch(k.getRozmiar()) {
		case S:
			System.out.println("Kupi�e� koszulke w rozmiarze small");
			break;
		case M:
			System.out.println("Kupi�e� koszulke w rozmiarze M");
			break;			
		case L:
			System.out.println("Kupi�e� koszulke w rozmiarze L");
			break;
		case XL:
			System.out.println("Kupi�e� koszulke w rozmiarze XL");
			break;			
		default:
			break;
		}
		
		
		int chestWidth = TshirtSize2.L.getChestWidth();
	}
}
