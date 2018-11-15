package polimor;

public class Tomatoe extends Product {
	private String size;	
	
	public Tomatoe(String name, int price, String size) {
		super(name, price);
		this.size = size;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice()*3;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}


	
	
}
