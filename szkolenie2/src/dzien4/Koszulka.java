package dzien4;

public class Koszulka {

	private String producent;
	private TshirtSize rozmiar;
	public Koszulka(String producent, TshirtSize rozmiar) {
		super();
		this.producent = producent;
		this.rozmiar = rozmiar;
	}
	@Override
	public String toString() {
		return "Koszulka [producent=" + producent + ", rozmiar=" + rozmiar + "]";
	}
	public TshirtSize getRozmiar() {
		return rozmiar;
	}
	public void setRozmiar(TshirtSize rozmiar) {
		this.rozmiar = rozmiar;
	}
	
	
	
}
