package polimor;

public class Singleton {
	private static volatile Singleton instance = null;
	
	private Singleton() {
		
	}
	
	static Singleton getInstance() {
		//pattern: Double-checked locking singleton
		if(instance == null) {
			synchronized(Singleton.class) {
				if (instance == null) {
					instance =  new Singleton();
				}
			}
		}
		return instance;
	}
	
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println("Czy to jest to samo?: " + (s ==s2));
	}
}
