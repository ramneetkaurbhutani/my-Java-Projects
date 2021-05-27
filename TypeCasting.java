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
	
			TypeCasting typecasting = new TypeCasting("8765846789");
		
			double d = Double.parseDouble(typecasting.getStr());
		int i = (int) d ;
		byte b = (byte) d;
		float f = (float) d;
		short s = (short) d;
		long l = (long) d;
		System.out.println("integer: " + i + "\nbyte: " + b + "\nfloat: " + f + "\nshort: " + s +
				"\nlong: " + l + "\ndouble: " + d);
		
		
		
	}

}
