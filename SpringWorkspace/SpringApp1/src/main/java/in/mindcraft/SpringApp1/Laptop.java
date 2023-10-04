package in.mindcraft.SpringApp1;

public class Laptop {
	private int lid;
	private String name;
	private double cost;
	
	public Laptop() {
		
	}
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public void display() {
		System.out.println(lid);
		System.out.println(name);
		System.out.println(cost); 
		
		
	}
	
	
}
