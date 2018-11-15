package it.kgtg.szkolenie2.klonowanie;

public class Punkt implements Cloneable
{
	
	private int x;
	private int y;
	
	public Punkt (int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}	
	
	public void setY(int y) {
		this.y = y;
	}		
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
