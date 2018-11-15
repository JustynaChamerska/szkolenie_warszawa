package polimor;

public class Apple extends Product {

	private transient String colour = "jakiœ";
	
	public Apple(String name, int price, String colour) {
		super(name, price);
		this.colour = colour;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public int getPrice() {
		return super.getPrice() * 2;
	}


	
	
}
