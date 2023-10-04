package in.mindcraft.SpringApp1;

public class Student {
	private int roll;
	private String name;
	private Address resd;
	private Laptop lap;
	
	public Student() {
		
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getResd() {
		return resd;
	}
	public void setResd(Address resd) {
		this.resd = resd;
	}
	public void setlap(Laptop lap) {
		this.lap = lap;
	}
	
	public void display() {
		System.out.println(roll+" "+name);
		resd.display();
		lap.display();
	}
	
	
}
