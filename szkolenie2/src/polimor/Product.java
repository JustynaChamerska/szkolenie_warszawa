package polimor;

import java.io.Serializable;

public class Product implements Serializable{
	
	private String name;
	private int price;
	public static final String[] ZAKAZANE;
	
	static  {
		ZAKAZANE =new String[2];
		ZAKAZANE[0] = "Wino";
		ZAKAZANE[1] = "Piwo";
		
	}
	
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	
	public int getPrice() {
		return this.price;
	}


	public String getName() {
		return name;
	}


	

}
