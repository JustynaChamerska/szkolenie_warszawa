package it.kgtg.szkolenie;

public class Dodawanie implements Operation{

	/* (non-Javadoc)
	 * @see it.kgtg.szkolenie.Operation#perform(java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public Integer perform(Integer first, Integer second) {
		return first + second;
	}


}
