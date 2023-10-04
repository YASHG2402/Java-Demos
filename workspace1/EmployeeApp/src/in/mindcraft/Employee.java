package in.mindcraft;

public class Employee {
	private int empid;
	private String name;
	private Date dob;
	
	public Employee() {
		empid = 101;
		name = "Soham";
		dob = new Date();
	}
	
	public Employee(int id, String n, int d, int m, int y) {
		empid = id;
		name = n;
		dob = new Date(d,m,y);
	}
	
	public void show() {
		System.out.println(empid);
		System.out.println(name);
		dob.show();
	}
}
