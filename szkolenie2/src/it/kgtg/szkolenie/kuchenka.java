package it.kgtg.szkolenie;

public class kuchenka implements grill, pieczenie{

	int temp;
	int time;
	
	@Override
	public void piecz() {
		// TODO Auto-generated method stub
		temp = 150;
		time = 45;
		turnOn();
	}

	@Override
	public void grilluj() {
		// TODO Auto-generated method stub
		temp = 180;
		time = 40;
		turnOn();		
		
	}
	
	public void turnOn() {
		System.out.println("W³¹czanie temp:" + temp + ", time:"+time);
	}
	


}
