package finals;

public final class MyStringUtils {
	

	private MyStringUtils() {
		
	}
	
	public static boolean isEmpty(String s) {
		return "".equals(s);
	}
	
	public static String changeCase(String s) {
		return s.toLowerCase();
	}
}
