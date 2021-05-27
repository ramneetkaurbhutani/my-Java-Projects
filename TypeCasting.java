public class TypeCasting {
	private String str;
	
	TypeCasting(String str){
		this.str = str ;
	}
	
	
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	
	public static void main(String[] args) {
//Implicit Type Conversion		
		System.out.println("Implicit Type conversion");
		
		char c = 'A';
		System.out.println("Value of character: " +c);
		
		int integer1 = c;
		System.out.println("character to integer: " +integer1);
		
		long integer2 = c;
		System.out.println("character to long: " +integer2);
		
		float decimal1 = c;
		System.out.println("character to float: " +decimal1);
		
		double decimal2 = c;
		System.out.println("character to double: " +decimal2);
			
// Explicit Type Conversion
		System.out.println("Explicit Type conversion");
		
			TypeCasting typecasting = new TypeCasting("8765846789");
		
			double d = Double.parseDouble(typecasting.getStr());
		int i = (int) d ;
		byte b = (byte) d;
		float f = (float) d;
		short s = (short) d;
		long l = (long) d;
		System.out.println("Value of double: " +d );
		System.out.println("Double to integer: " + i + "\nDouble to byte: " + b 
		+ "\nDouble to float: " + f + "\nDouble to short: " + s + "\nDouble to long: " + l );
		
		
		
	}

}
