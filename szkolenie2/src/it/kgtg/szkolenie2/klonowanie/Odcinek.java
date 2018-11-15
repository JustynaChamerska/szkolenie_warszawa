package it.kgtg.szkolenie2.klonowanie;

public class Odcinek implements Cloneable{
	
	private Punkt start;
	private Punkt end;
	
	public Odcinek(Punkt start, Punkt end) {
		super();
		this.start = start;
		this.end = end;
	}

	public Punkt getStart() {
		return start;
	}

	public Punkt getEnd() {
		return end;
	}
	
	public void setStart( Punkt start) {
		this.start = start;
	}	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Odcinek [start=");
		builder.append(start);
		builder.append(", end=");
		builder.append(end);
		builder.append("]");
		return builder.toString();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
/*
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Odcinek o =(Odcinek) super.clone();
		Punkt start = (Punkt) this.getStart().clone();
		Punkt end = (Punkt) this.getEnd().clone();
		
		o.setStart(start);
		o.setEnd(end);
		return o;

	}
*/	
	
	
}
