
public class MethodExecution {
	
	public int multiplynumbers(int a, int b)
	{
		return a*b;
	}
	
	//call by value
	int val = 150;
	public int operation(int val) {
		val = val*10/100;
		return val;
	}
	
//method overloading
	public void area(int l, int b) {
		System.out.println("Area of rectangle: " + l*b); 
	}
	
	public void area(int r) {
		System.out.println("Area of circle: " + 3.14*r*r);
		
	}
	
	public static void main(String[] args) {
		MethodExecution m = new MethodExecution();
		int result = m.multiplynumbers(3, 5);
		System.out.println("Multiplication of 3 and 5 is " + result);
		System.out.println("----------------------------------------");
		
		System.out.println("Before operation value of data is: " + m.val);
		int value = m.operation(100);
		System.out.println("After operation value of data is: " + m.val);
		System.out.println("Value of operation: " + value);
		System.out.println("----------------------------------------");
		
		m.area(7, 5);
		m.area(3);
		
		
		
	}
}
