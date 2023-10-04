package in.mindcraft.pojos;

public class Laptop {

	private int lid;
	private String name;
	private double cost;
	
	public Laptop() {
		
	}
	
	public Laptop(int lid, String name, double cost) {
		this.lid = lid;
		this.name = name;
		this.cost = cost;
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
	
	
}
