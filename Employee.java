
public class Employee {
	private int id;
	private String name;
	
	Employee(){
		
	}
	
	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee(101, "Alex");
		Employee emp4 = new Employee(201, "Himanshu");
		
		emp1.display();
		emp2.display();
		emp3.display();
        emp4.display();		
		
	}
}
