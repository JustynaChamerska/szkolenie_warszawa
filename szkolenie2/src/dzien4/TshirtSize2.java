package dzien4;

public enum TshirtSize2 {

	S(1, 2, 3),
	M(1, 2, 3),
	L(1, 2, 3),
	XL(1, 2, 3);
	
	private int chestWidth;
	private int shirtLength;
	private int sleeveLength;
	private TshirtSize2(int chestWidth, int shirtLength, int sleeveLength) {
		this.chestWidth = chestWidth;
		this.shirtLength = shirtLength;
		this.sleeveLength = sleeveLength;
	}
	public int getChestWidth() {
		return chestWidth;
	}
	public int getShirtLength() {
		return shirtLength;
	}
	public int getSleeveLength() {
		return sleeveLength;
	}
	public void setChestWidth(int chestWidth) {
		this.chestWidth = chestWidth;
	}
	public void setShirtLength(int shirtLength) {
		this.shirtLength = shirtLength;
	}
	public void setSleeveLength(int sleeveLength) {
		this.sleeveLength = sleeveLength;
	}
	


}
