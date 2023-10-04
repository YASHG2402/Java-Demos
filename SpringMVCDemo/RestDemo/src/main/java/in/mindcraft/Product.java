package in.mindcraft;

public class Product {
	
	private int pid;
	private String name;
	private double cost;
	
	public Product() {
		
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public String setName(String name) {
		return this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public Product(int pid, String name, double cost) {
		super();
		this.pid = pid;
		this.name = name;
		this.cost = cost;
	}

	public void show() {
		System.out.println(pid);
		System.out.println(name);
		System.out.println(cost);
	}
}
