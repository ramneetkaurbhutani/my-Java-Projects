

class DefAccessSpecifier{
	//default access specifier
	void display() {
		System.out.println("This is default access specifier");
	}
}

class PrivateAccessSpecifier {
	//private access specifier
private void display() {
	System.out.println("This is private access specifier");
}
	 
}

 public  class AccessSpecifier1 {
	  public static void main(String[] args) {
		
DefAccessSpecifier obj = new DefAccessSpecifier(); 
obj.display();

PrivateAccessSpecifier obj1 = new PrivateAccessSpecifier();
//trying to access private method of other class
//obj1.display();

	  }
  }
