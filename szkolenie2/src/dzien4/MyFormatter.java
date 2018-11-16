package dzien4;

public enum MyFormatter {

	CALM{

		@Override
		public String format(String message) {
			// TODO Auto-generated method stub
			return "Here is my message: " + message;
		}
		
	},
	NERVOUS{

		@Override
		public String format(String message) {
			// TODO Auto-generated method stub
			return "ARGH! STOP it or " +message;
		}
		
	};
	
	public abstract String format(String message);
	public static void main(String[] args) {
		String message =  MyFormatter.CALM.format("Jest fajnie");
		System.out.println(message);
		
		String message2 =  MyFormatter.CALM.format("ci...");
		System.out.println(message2);
		
	}
}
